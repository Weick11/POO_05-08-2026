package poo.erick.br;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class App {

    public static void main(String[] args) {
         List<Pessoa> lista = Arrays.asList(
                new Pessoa(1, "Huguinho", Departamento.FINANCEIRO, 40),
                new Pessoa(4, "Zezinho", Departamento.FINANCEIRO, 32),
                new Pessoa(3, "Luizinho", Departamento.VENDAS, 57),
                new  Pessoa(9, "Patinhas",   Departamento.VENDAS, 40),
                new Pessoa(10, "Donald", Departamento.GERENCIA, 54),
                new Pessoa(2, "Margarida", Departamento.FINANCEIRO, 40),
                new Pessoa(8, "Joe Doe", Departamento.VENDAS, 34),
                new Pessoa(5, "Jane Doe", Departamento.VENDAS, 22),
                new Pessoa(6, "Sr Smith", Departamento.VENDAS, 40),
                new Pessoa(7, "Sra Smith", Departamento.GERENCIA, 39),
                 new Pessoa(11, "Trinity", Departamento.VENDAS, 34),
                 new Pessoa(14, "Morpheus", Departamento.FINANCEIRO, 22),
                 new Pessoa(16, "AgenteSmith", Departamento.VENDAS, 47),
                 new Pessoa(13, "Neo", Departamento.GERENCIA, 29)
        );

        /***
         * Exercício
         *      - escreva as consultas solicitadas utilizando
         *        apenas expressões lambda e operações de agregação
          */
        System.out.println("\n1. Funcionários do setor de vendas:");
        var c1 = lista.stream()
                        .filter( p -> p.getDpto() == Departamento.VENDAS);
                        c1.forEach(System.out::println);

        System.out.println("\n2. Funcionários do setor de vendas com idade entre 20 e 30 anos");
        var c2 = lista.stream()
                        .filter( p -> p.getDpto() == Departamento.VENDAS)
                        .filter( p -> p.getIdade() >= 20 && p.getIdade() <=30);
                        c2.forEach(System.out::println);

        System.out.println("\n3. Nomes (em maiúsculas) dos funcionários do setor de vendas");
        var c3 = lista.stream()
                        .filter( p -> p.getDpto() == Departamento.VENDAS);
                        c3.forEach( p -> System.out.println(p.getNome().toUpperCase()));

        System.out.println("\n4. Todos os gerentes:");
        var c4 = lista.stream()
                        .filter( p -> p.getDpto() == Departamento.GERENCIA);
                        c4.forEach(System.out::println);

        System.out.println("\n5. Idade média dos gerentes:");
        lista.stream()
                        .filter(p -> p.getDpto() == Departamento.GERENCIA)
                        .mapToInt(Pessoa::getIdade)
                        .average()
                        .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Nenhum gerente encontrado")
             );

        System.out.println("\n6. Funcionarios ordenados pelo código:");
        lista.stream()
                        .sorted(Comparator.comparingInt(Pessoa::getId))
                        .forEach(System.out::println);

        System.out.println("\n7. Funcionários ordenados pela idade+nome:");
        lista.stream()
                        .sorted(Comparator.comparingInt(Pessoa::getIdade)
                               .thenComparing(Pessoa::getNome))
                        .forEach(System.out::println);

        System.out.println("\n8. Criar uma nova lista apenas com os funcionarios do financeiro:");
        List<Pessoa> c8 = lista.stream()
                        .filter(p -> p.getDpto() == Departamento.FINANCEIRO)
                        .collect(Collectors.toList());
                        c8.forEach(System.out::println);

        System.out.println("\n9. Nome e setor da pessoa mais jovem:");
        lista.stream()
                        .min(Comparator.comparingInt(Pessoa::getIdade))
                        .ifPresent(p -> System.out.println("Nome: " + p.getNome() + " | Setor: " + p.getDpto()));
    }
}
