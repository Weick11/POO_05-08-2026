package br.erick.poo;

public class App {

    public static void main(String[] args) {
        CadastroFuncionarios cadFunc = CadastroFuncionarios.getInstance();
        System.out.println(cadFunc.RelatorioFuncionarios());

        TerminalConsulta tc = new TerminalConsulta();
        tc.menu();

        // new TerminalConsulta().menu();
    }
}
