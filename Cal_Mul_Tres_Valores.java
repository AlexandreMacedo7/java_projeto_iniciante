//Programa para calculo de 3 valores.

import java.util.Scanner;

public class Cal_Mul_Tres_Valores
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int x, y, z, result;

        System.out.print("Digite o primeiro valor: ");
        x = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        y = input.nextInt();
        System.out.print("Digite o tercerio valor: ");
        z = input.nextInt();

        result = (x * y * z);

        System.out.printf("A multiplicação de %d por %d e por %d é igual: %d", x, y, z, result);


    }
}
