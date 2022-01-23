import java.util.Scanner;

public class Cal_Dois_Valores
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int number1, number2;
        int soma, produto, diferenca, divisao, resto, media;

        System.out.print("Digite o primeiro valor: ");
        number1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        number2 = input.nextInt();

        soma = number1 + number2;
        produto = number1 * number2;
        diferenca = number1 - number2;
        divisao = number1 / number2;
        resto = number1 % number2;
        media = (number1+number2)/2;

        System.out.printf("%d + %d = %d%n",number1, number2, soma);
        System.out.printf("%d * %d = %d%n",number1, number2, produto);
        System.out.printf("%d - %d = %d%n",number1, number2, diferenca);
        System.out.printf("%d / %d = %d%n", number1, number2, divisao);
        System.out.printf("%d %% %d = %d%n", number1, number2, resto);
        System.out.printf("%d Média %d = %d%n", number1, number2, media);

        if (number1 > number2)
            System.out.printf("\nO valor %d é maior que o valor %d.", number1,number2);
        if (number1 < number2)
            System.out.printf("\nO valodr %d é menor que o valor %d.", number1, number2);
        if(number1 == number2)
            System.out.printf("\nO valor %d é igual ao valor %d.", number1, number2);


    }


}
