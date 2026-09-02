package br.erick.poo;

import java.util.ArrayList;

public class CadastroImovel {

    private ArrayList<Imovel> lista;

    private CadastroImovel() {
        lista = new ArrayList<>();
    }

    private static CadastroImovel instance;

    public static CadastroImovel getInstance() {
        if (instance == null)
            instance = new CadastroImovel();

        return instance;

    }

    public void inserir(Imovel imo) {
        lista.add(imo);
    }

    public void inserirResidencial(String proprietario, int areaConstruida, int vr, Geo localizacao, int areaTerreno) {
        Imovel novo = new Residencial(proprietario, areaConstruida, vr, localizacao, areaTerreno);
        lista.add(novo);
    }

    public void inserirComercial(String proprietario, int areaConstruida, double vr, Geo localizacao) {
        Imovel novo = new Comercial(proprietario, areaConstruida, vr, localizacao);
        lista.add(novo);
    }

    public Imovel pesquisar(Geo localizacao) {
        for (Imovel imo : lista) {
            if (imo.getLocalizacao() == localizacao)
                return imo;
        }
        return null;
    }

   public Imovel pesquisar(String proprietario) {
        for (Imovel imo : lista) {
            if (imo.getProprietario().equals(proprietario))
                return imo;
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

        StringBuilder aux = new StringBuilder("\nCadastro de Imovel\n- - - - - - - - - - -\n");
        for (Imovel imo : lista) {
            aux.append(imo.toString() + "\n");

        }
        return aux.toString();

    }
}

