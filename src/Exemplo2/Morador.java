package Exemplo2;

public class Morador extends Pessoa {
    private String telefone;
    private double renda;

    public Morador() {

    }

    public Morador(String nome, String cpf, String telefone, double renda) {
        super(nome, cpf);
        this.telefone = telefone;
        this.renda = renda;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append(super.toString());
        retorno.append("\n Telefone: " +telefone);
        retorno.append("\n Renda do morador: R$"+renda+ " reais.");
        return retorno.toString();
    }
}
