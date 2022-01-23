import java.util.Scanner;

public class Separando_Digitos_em_um_Inteiro
{

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int valor;
        int resultado1;
        int resto1;
        int resultado2;
        int resto2;
        int resultado3;
        int resto3;
        int resultado4;
        int resto4;
        int resultado5;

        System.out.print( " Insira 5 digitos inteiros: " );
        valor = input.nextInt();

        resultado1 = valor / 10000;//55555 / 10000 = 5,5555
        resto1 = valor % 10000;// 55555 % 10000 = 5555

        resultado2 = resto1 / 1000;//5555 / 1000 = 5,555
        resto2 = resto1 % 1000;// 5555 % 1000 = 555

        resultado3 = resto2 / 100;// 555 / 100 = 5
        resto3 = resto2 % 100;// 555 % 100 = 55

        resultado4 = resto3 / 10;// 55 / 10 = 5
        resto4 = resto3 % 10;// 55 % 10 = 5

        resultado5 = resto4;// 5

        System.out.printf( "%d, %d, %d, %d e %d", resultado1, resultado2, resultado3, resultado4, resultado5 );

    }

}
