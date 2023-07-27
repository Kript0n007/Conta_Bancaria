package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Integer mes = 1;

        System.out.println("+Bem vindo ao Banco Unibank+");
        System.out.println("Selecione uma opcão");
        System.out.println("1 - Crear Conta ");
        System.out.println("2- Sair");

        Scanner scanner = new Scanner(System.in);

        Integer op1 = scanner.nextInt();

        switch (op1) {
            case 1:
                boolean sessao = true;
                System.out.println( "Escolha um nome de usuario");

                scanner.nextLine();

                String nome = scanner.nextLine();

                Conta conta = new Conta(nome);

                if (nome != null){

                    do {
                        System.out.println(conta.getNome() + " |   "+ "MES: "+mes +"  | Saldo: " + conta.getSaldo() + "|  Investido: " + conta.getInvestimento());
                        System.out.println("1 | Resgatar");
                        System.out.println("2 | Depositar");
                        System.out.println("3 | Proximo mes");
                        System.out.println("4 | Investir");
                        System.out.println("5 | Resgatar investimento");
                        System.out.println("6 | Sair");
                        Integer op2 = scanner.nextInt();


                        switch (op2) {
                            case 1:
                                System.out.println( "Quanto deseja resgatar ? ");
                                Float resgate = scanner.nextFloat();
                                conta.resgatar(resgate);

                                break;

                            case 2:
                                System.out.println( "Quanto deseja depositar ? ");
                                Float deposito = scanner.nextFloat();
                                conta.depositar(deposito);
                                break;

                            case 3:
                                Float invest_antigo = conta.getInvestimento();
                                Float invest_novo = invest_antigo * 1.05F;
                                conta.setInvestimento(invest_novo);
                                mes += 1;

                                break;

                            case 4:
                                System.out.println( " Quanto voce deseja investir ? ");
                                Float invest = scanner.nextFloat();
                                conta.investir(invest);
                                break;

                            case 5:
                                System.out.println( "Quanto deseja resgatar do investimento ? ");
                                Float resgate_invest = scanner.nextFloat();
                                conta.resgatar_invest(resgate_invest);
                                break;

                            case 6:
                                sessao = false;
                                System.out.println("Ate a proxima, sessao encerrada");
                                break;




                        }


                    }while (sessao ); } else{
                    System.out.println( "Erro nome indefinido");}

                System.exit(0);

                break;


            case 2:
                System.exit(0);

                break;

            default:
        }
    }

}