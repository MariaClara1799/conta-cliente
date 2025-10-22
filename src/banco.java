import java.util.Scanner;

public class banco {
    public static void main(String[] args) {


        String nome = "Maria Clara";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500;
        int valorSaldo = 0;

        System.out.println("Dados do cliente ");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo inicial: " + nome);
        System.out.println("\n*********************");
        System.out.println("Escolha uma opção: ");
        System.out.println("*********************");

        String menu = """
                Digite uma opção do menu:
                1- Consultar saldo
                2- Transferir saldo
                3- Receber valor
                4- Sair
                """;

        Scanner leitura = new Scanner(System.in);



        while (valorSaldo != 4){ //enquanto valorSaldo for diferente de 4, ele vai exibir o menu e ler a opção
            System.out.println(menu);
            valorSaldo = leitura.nextInt();

            if (valorSaldo == 1) {
                System.out.println("O saldo é: " + saldoInicial);
            }else if (valorSaldo == 2) {
                System.out.println("Que valor deseja transferir? ");
                int valorTransferencia = leitura.nextInt();
                if (valorTransferencia < 2500) {
                    double valorDaTransferencia = saldoInicial - valorTransferencia;
                    System.out.println("Saldo atualizado: " + valorDaTransferencia);
                } else {
                    System.out.println("Saldo insuficiente ");

                } if (valorSaldo == 3) {
                System.out.println("Qual o valor da transferência? ");
                double valorAMais = leitura.nextDouble();
                double valorFinal = saldoInicial + valorAMais;
                System.out.println("Saldo atualizado: " + valorFinal);



                }break;

            }
        }
    }
}