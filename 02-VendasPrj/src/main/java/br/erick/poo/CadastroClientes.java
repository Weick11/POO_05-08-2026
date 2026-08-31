package br.erick.poo;

import java.util.ArrayList;

public class CadastroClientes {
    private ArrayList<Cliente> lista;

    // sim... parece não fazer sentido
    // pq então?
    // - porque implementa um "padrão de projeto" chamado singleton
    // e em algum momento vamos entender a importância disso
    private CadastroClientes() {
        lista = new ArrayList<>();
    }

    private static CadastroClientes instance;

    public static CadastroClientes getInstance() {
        if (instance == null)
            instance = new CadastroClientes();

        return instance;

    }

    public void inserir(Cliente cli) {
        lista.add(cli);
    }

    public void inserirPF(int umCod, String umNome, String cpf) {
        Cliente novo = new ClientePF(umCod, umNome, cpf);
        lista.add(novo);
    }

    public void inserirPJ(int umCod, String umNome, String cnpj) {
        Cliente novo = new ClientePJ(umCod, umNome, cnpj);
        lista.add(novo);
    }

    public Cliente pesquisar(int cod) {
        for (Cliente cli : lista) {
            if (cli.getCodigo() == cod)
                return cli;
        }
        return null;
    }

   public Cliente pesquisar(String id) {
        for (Cliente cli : lista) {
            if (cli.getID().equals(id))
                return cli;
        }
        return null;
    }

    public String toString() {
        /*
         * String aux = "\nCadastro de Clientes\n- - - - - - - - - - -\n";
         * for (Cliente umCliente : lista) {
         * aux = aux + umCliente.toString() + "\n";
         * //aux += umCliente.toString() + "\n";
         *
         * }
         * return aux;
         */

        StringBuilder aux = new StringBuilder("\nCadastro de Clientes\n- - - - - - - - - - -\n");
        for (Cliente umCliente : lista) {
            aux.append(umCliente.toString() + "\n");

        }
        return aux.toString();

    }
}
