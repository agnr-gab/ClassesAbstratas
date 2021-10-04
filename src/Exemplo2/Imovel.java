package Exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereco;
    private double valorDoAluguel;
    private Funcionario funcionarioResponsavel;
    static List<Morador> moradores = new ArrayList<>();

    public Imovel() {
    }

    public Imovel(String endereco, double valorDoAluguel) {
        this.endereco = endereco;
        this.valorDoAluguel = valorDoAluguel;
    }

    public Imovel(String endereco, double valorDoAluguel, Funcionario funcionarioResponsavel) {
        this.endereco = endereco;
        this.valorDoAluguel = valorDoAluguel;
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(double valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void setMoradores(List<Morador> moradores) {
        this.moradores = moradores;
    }

    public void adicionarMorador(Morador novoMorador) {
        moradores.add(novoMorador);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n ______Endereço: " + endereco);
        retorno.append("\n Valor do Aluguel: R$" + valorDoAluguel);
        retorno.append("\n ______Funcionário responsável______ " + funcionarioResponsavel);
        retorno.append("\n Quantidade de moradores: " + moradores.size());
        retorno.append("\n ______Lista de moradores______ " + moradores);
        return retorno.toString();
    }
}
