package Exemplo2;

import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }
    public static void menu(){
        System.out.println("Sistema imobiliária");
        System.out.println("Digite [1] Para cadastrar um imóvel. ");
        System.out.println("Digite [2] Para exibir os imóveis cadastrados. ");
        System.out.println("Digite [3] Para sair");
    }
    public static Morador cadastrarMoradores(){
        String nome = capturarDados("Digite o nome: ").nextLine();
        String cpf = capturarDados("Digite o cpf: ").nextLine();
        String telefone = capturarDados("Digite o  telefone: ").nextLine();
        double renda = capturarDados("Digite o salario: ").nextDouble();

        Morador morador = new Morador(nome, cpf, telefone, renda);
        return morador;
    }


}
