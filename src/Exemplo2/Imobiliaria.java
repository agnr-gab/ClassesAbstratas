package Exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    static List <Imovel> imoveis = new ArrayList<>();

    public void adicionarImovel(Imovel imovel){
        imoveis.add(imovel);
    }

    public static List<Imovel> getImoveis() {
        return imoveis;
    }

    public static void setImoveis(List<Imovel> imoveis) {
        Imobiliaria.imoveis = imoveis;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Quantidade de imoveis: " +imoveis.size());
        retorno.append("\nImoveis: ");
        retorno.append("\n " +imoveis);
        return retorno.toString();
    }
}
