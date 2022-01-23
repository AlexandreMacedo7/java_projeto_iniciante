public class PopulacaoMundial
{
    public static void main(String [] args)
    {

        double populacaoMundial = 7.916543302, aumento, um, dois = 0, tres = 0, quatro = 0;

        aumento = populacaoMundial * 1.1 / 100;
        um = populacaoMundial + aumento;

        System.out.print("Crescimento populacional de 1.1% ao ano.\n");
        System.out.printf("População mundial atual: %f%n", populacaoMundial);
        System.out.printf("População mundial 2023: %f%n", um);
        System.out.printf("População mundial 2024: %f%n", dois = um + aumento);
        System.out.printf("População mundial 2025: %f%n", tres = dois + aumento);
        System.out.printf("População mundial 2026: %f%n", quatro = tres + aumento);
        System.out.printf("População mundial 2027: %f%n", quatro + aumento);


    }

}
