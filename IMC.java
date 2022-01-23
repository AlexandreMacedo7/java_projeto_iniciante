import java.util.Scanner;

public class IMC
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        float altura, peso, imc;

        System.out.println("Digite a sua altura: ");
        altura = input.nextFloat();
        System.out.println("Digite o seu peso: ");
        peso = input.nextFloat();

        imc = peso / (altura * altura);
        System.out.printf("IMC: %2.2f%n", imc);

        if (imc < 18.5)
            System.out.print("Abaixo do peso!");

        if (imc >= 18.5 && imc <= 24.9)
            System.out.print("Peso Normal.");

        if (imc >= 25 && imc <= 29.9)
            System.out.print("Acima do peso!");

        if (imc > 30)
            System.out.print("Obesidade!!!");

    }

}
