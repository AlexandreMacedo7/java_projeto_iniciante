import java.util.Scanner;
public class Separador
{

    public static void main(String[] args)
        {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um numero inteiro com 3 algarismos: ");
            int numero = entrada.nextInt();

            System.out.printf("%d %d %d\n", numero / 100, numero % 100 / 10, numero % 10);

        }

}
