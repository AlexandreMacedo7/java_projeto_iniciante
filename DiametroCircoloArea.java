import java.util.Scanner;


public class DiametroCircoloArea
{

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int raio;

        System.out.print("Digite o valor do raio em um valor inteiro: ");
        raio = input.nextInt();

        System.out.printf("Raio: %d - Diâmetro: %d - Circunferência: %f- Área: %f.", raio, 2 * raio, 2 * Math.PI * raio, Math.PI * (raio * raio));

    }

}
