import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        ExchangerateApi cunsulta = new ExchangerateApi();
        double valor;
        int opcao = 0;
        String msg = "Digite o valor que irá converter: ";


        while (opcao != 7) {


            System.out.println("""
                     ****************************************************
                     | Bem-vindo ao conversor de moedas:                |
                     |                                                  |
                     | 1) Dolar => Real                                 |
                     | 2) Real => Dolar                                 |
                     | 3) Dolar => Euro                                 |
                     | 4) Euro => Dolar                                 |
                     | 5) Dolar => Libra esterlina                      |
                     | 6) Libra esterlina => Dolar                      |
                     | 7) Sair                                          |
                     |                                                  |
                     ****************************************************
                    """);

            System.out.println("Selecione uma opção: ");
            opcao = leitura.nextInt();

            if (Objects.equals(opcao, 1)) {
                Conversor conversor = cunsulta.ObtemMoeda("USD", "BRL");
                System.out.println(msg);
                valor = leitura.nextDouble();
                System.out.printf("Valor %.2f [USD] Corresponde a ==> " + conversor.conversion_rate() * valor + "[BRL]%n", valor);
            } else if (Objects.equals(opcao, 2)) {
                Conversor conversor = cunsulta.ObtemMoeda("BRL", "USD");
                System.out.println(msg);
                valor = leitura.nextDouble();
                System.out.printf("Valor %.2f [BRL] Corresponde a ==> " + conversor.conversion_rate() * valor + "[USD]%n", valor);
            } else if (Objects.equals(opcao, 3)) {
                Conversor conversor = cunsulta.ObtemMoeda("USD", "EUR");
                System.out.println(msg);
                valor = leitura.nextDouble();
                System.out.printf("Valor %.2f [USD] Corresponde a ==> " + conversor.conversion_rate() * valor + "[EUR]%n", valor);
            } else if (Objects.equals(opcao, 4)) {
                Conversor conversor = cunsulta.ObtemMoeda("EUR", "USD");
                System.out.println(msg);
                valor = leitura.nextDouble();
                System.out.printf("Valor %.2f [EUR] Corresponde a ==> " + conversor.conversion_rate() * valor + "[USD]%n", valor);
            } else if (Objects.equals(opcao, 5)) {
                Conversor conversor = cunsulta.ObtemMoeda("USD", "GBP");
                System.out.println(msg);
                valor = leitura.nextDouble();
                System.out.printf("Valor %.2f [USD] Corresponde a ==> " + conversor.conversion_rate() * valor + "[GBP]%n", valor);
            } else if (Objects.equals(opcao, 6)) {
                Conversor conversor = cunsulta.ObtemMoeda("GBP", "USD");
                System.out.println(msg);
                valor = leitura.nextDouble();
                System.out.printf("Valor %.2f [GBP] Corresponde a ==> " + conversor.conversion_rate() * valor + "[USD]%n", valor);
            } else if (Objects.equals(opcao, 7)) {
                break;
            }

            System.out.println("Digite [0] para continuar| [7] para sair");
            opcao = leitura.nextInt();

        }

        System.out.println("Programa finalizado!");
    }
}