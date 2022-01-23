import java.util.Scanner; //utiliza a classe Scanner

public class Addition
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);//Scanner - ler dados - Input - Receber dados = Inicializa
        //new  - Cria o objeto - System.in - Aplicativos leiam em bytes info. digitadas
        //O scanner traduz esses bytes em números inteiros

    int number1;
    int number2;
    int sum;

    System.out.print("Digite o primeiro número inteiro: ");
    number1 = input.nextInt();//Lê e armazena o primeiro número interio.

        System.out. print("Digite o segundo número inteiro: ");
        number2 = input.nextInt();

        sum = number1 +  number2;

        System.out.printf("A soma é %d%n", sum);



    }
}
