import java.util.Scanner;

public class Calculadora_Economica
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        float km, gas, medL, est, ped;//dados
        float combustivel, taxas, total;

        System.out.print("Digite os Kms rodados em um dia: ");
        km = input.nextFloat();

        System.out.print("Digite o preço litro da gasolina: R$ ");
        gas = input.nextFloat();

        System.out.print("Digite os Kms médios por litro: ");
        medL = input.nextFloat();

        System.out.print("Digite a taxa de estacionamento por dia: R$ ");
        est = input.nextFloat();

        System.out.print("Digite a taxa de pedádigo por dia: R$ ");
        ped = input.nextFloat();


        combustivel = km / medL * gas;
        taxas = est + ped;
        total = combustivel + taxas;

        System.out.printf("Combustivel: %2.2f por dia.%n", combustivel);
        System.out.printf("Taxas usuais R$ %2.2f.%n", taxas);
        System.out.printf("Total gasto por dia: R$ %2.2f.%n", total);
        System.out.printf("Total de gasto por mês: R$ %2.2f%n", total * 20);//dias de trabablho em um mês.
        System.out.printf("Total de gasto POR ANO: R$ %2.2f%n", total * 240);//ano



    }

}
