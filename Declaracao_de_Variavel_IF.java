import java.util.Scanner;

public class Declaracao_de_Variavel_IF
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int c, thisIsAVariable, q76354;
        int value;
        int number;

        System.out.print("Digite um valor inteiro:");
        value = input.nextInt();

        System.out.println("This is a Java program\n");
        System.out.printf("%s%n %s%n", "This is a Java", "program\n");

        System.out.print("Digite um valor inteiro: ");
        number = input.nextInt();//Recebendo valor inteiro.

        if (number != 7)//Comparando valor
            System.out.printf("%d é diferente de %d%n", number, 7);


    }

}
