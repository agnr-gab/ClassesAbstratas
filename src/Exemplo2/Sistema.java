package Exemplo2;

import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menu() {
        System.out.println("\n______Sistema imobiliária______");
        System.out.println("Digite [1] Para cadastrar um imóvel. ");
        System.out.println("Digite [2] Para exibir os imóveis cadastrados. ");
        System.out.println("Digite [3] Para sair");
    }

    public static Morador cadastrarMoradores() {
        String nome = capturarDados("Digite o nome: ").nextLine();
        String cpf = capturarDados("Digite o cpf: ").nextLine();
        String telefone = capturarDados("Digite o  telefone: ").nextLine();
        double renda = capturarDados("Digite o salário: ").nextDouble();
        System.out.println("______Cadastro realizado com sucesso!______");

        Morador morador = new Morador(nome, cpf, telefone, renda);
        return morador;
    }

    public static Imovel adicionarMoradores(Imovel imovel) {
        int qtdMoradores = capturarDados("Digite a quantidade de moradores: ").nextInt();
        for (int i = 1; i <= qtdMoradores; i++) {
            System.out.println("Cadastrar o " + i + "º morador");
            Morador morador = cadastrarMoradores();
            imovel.adicionarMorador(morador);
        }
        return imovel;
    }

    public static Funcionario cadastrarFuncionario() {
        String nome = capturarDados("Digite o nome do Funcionário: ").nextLine();
        String cpf = capturarDados("Digite o cpf do Funcionário: ").nextLine();
        String ctps = capturarDados("Digite o número da carteira de trabalho do Funcionário: ").nextLine();

        Funcionario funcionario = new Funcionario(nome, cpf, ctps);
        return funcionario;
    }

    public static Imovel cadastrarImovel() {
        String endereco = capturarDados("Digite o endereço: ").nextLine();
        double valorAluguel = capturarDados("Digite o valor do aluguel: R$").nextDouble();

        Imovel imovel = new Imovel(endereco, valorAluguel);
        return imovel;
    }

    public static void executar() {
        boolean menu = true;
        Imobiliaria imobiliaria = new Imobiliaria();

        while (menu) {


            menu();
            int opcaoDoUsuario = capturarDados("___Digite a opção desejada___").nextInt();
            switch (opcaoDoUsuario) {
                case 1:
                    Imovel imovel = cadastrarImovel();
                    System.out.println("___Faça o cadastro do funcionário responsável___ ");
                    Funcionario funcionario = cadastrarFuncionario();
                    imovel.setFuncionarioResponsavel(funcionario);
                    adicionarMoradores(imovel);
                    imobiliaria.adicionarImovel(imovel);
                    break;
                case 2:
                    System.out.println(imobiliaria);
                    break;
                case 3:
                    System.out.println("___Sistema encerrado___ \n ___Volte sempre!___");
                    menu = false;
                    break;
            }
        }
    }
}

