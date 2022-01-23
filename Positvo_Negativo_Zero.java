//Atividade executada sem o uso de estruturas de repetição

import java.util.Scanner;

public class Positvo_Negativo_Zero
{

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int valor1, valor2, valor3, valor4, valor5;//valores do usuário
        int z1 = 0, z2 = 0, z3 = 0, z4 = 0, z5 =0;//contadores de zero
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0;//contadores de negativo
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;//contadores de positivo
        int zero, positivo, negativo;//totais dos dados

        System.out.print("Digite um valor inteiro: ");
        valor1 = input.nextInt();

        if (valor1 == 0)
            z1 = 1;
        if (valor1 > 0)
            p1 = 1;
        if (valor1 < 0)
            n1 = 1;

        System.out.print("Digite um valor inteiro: ");
        valor2 = input.nextInt();

        if (valor2 == 0)
            z2 = 1;
        if (valor2 > 0)
            p2 = 1;
        if (valor2 < 0)
            n2 = 1;


        System.out.print("Digite um valor inteiro: ");
        valor3 = input.nextInt();
        if (valor3 == 0)
            z3 = 1;
        if (valor3 > 0)
            p3 = 1;
        if (valor3 < 0)
            n3 = 1;

        System.out.print("Digite um valor inteiro: ");
        valor4 = input.nextInt();
        if (valor4 == 0)
            z4 = 1;
        if (valor4 > 0)
            p4 = 1;
        if (valor4 < 0)
            n4 = 1;

        System.out.print("Digite um valor inteiro: ");
        valor5 = input.nextInt();
        if (valor5 == 0)
            z5 = 1;
        if (valor5 > 0)
            p5 = 1;
        if (valor5 < 0)
            n5 = 1;

        //soma dos totais de cada contador
        zero = z1 + z2 + z3 + z4 + z5;
        negativo = n1 + n2 + n3 + n4 + n5;
        positivo = p1 + p2 + p3 + p4 + p5;

        System.out.printf("Zeros = %d - Negativos %d - Positivos %d", zero, negativo, positivo);


    }

}
