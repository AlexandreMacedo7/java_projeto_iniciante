import java.util.Scanner;

public class ImparPar
{

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int valor, valor2;//Declaração variavel

        System.out.print("Digite um valor inteiro: ");
        valor = input.nextInt();

        if(valor % 2 == 0 )
            System.out.printf("O valor %d é par!%n", valor);

        if(valor % 2 == 1)
            System.out.printf("O valor %d é impar!%n", valor);

        //Verificação de números multiplos.

        System.out.print("Digite um segundo valor: ");
        valor2 = input.nextInt();

        if(valor % valor2 == 0)
            System.out.printf("O valor %d é multiplo de %d.", valor, valor2);

        if(valor % valor2 != 0)
            System.out.printf("O valor %d NÃO é multiplo de %d.", valor, valor2);
    }
}
