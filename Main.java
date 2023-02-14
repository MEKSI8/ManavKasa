import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float armut = 2.14f;
        float elma = 3.67f;
        float domates = 1.11f;
        float muz = 0.95f;
        float patlican = 5f;



        System.out.println("Armut kaç kilo =");
        float kilogram=input.nextFloat();
        System.out.println("Elma kaç kilo =");
        float kilogram2=input.nextFloat();
        System.out.println("Domates kaç kilo =");
        float kilogram3=input.nextFloat();
        System.out.println("Muz kaç kilo =");
        float kilogram4=input.nextFloat();
        System.out.println("Patlıcan kaç kilo =");
        float kilogram5=input.nextFloat();

        float toplam=kilogram*armut+kilogram2*elma+kilogram3*domates+kilogram4*muz+kilogram5*patlican;

        System.out.println("Toplam tutar:"+toplam);


    }
}