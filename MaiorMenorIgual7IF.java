//Valor "c" é maior, menor ou igual a 7

import java.util.Scanner;

public class MaiorMenorIgual7IF
{

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int c;

        System.out.print("Digite um valor para \"c\": ");
        c = input.nextInt();

        if (c < 7)
            System.out.println("C é menor que 7");
        if (c >= 7)
            System.out.println("C é maior ou igual a 7");

    }

}
