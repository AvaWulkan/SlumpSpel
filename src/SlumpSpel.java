import java.util.Scanner;
import java.util.Random;

public class SlumpSpel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean spela = true;
        while (spela) {

            int slumpTal;
            System.out.println("Hur högt får det slumpade talet vara?");
            int hogsta = sc.nextInt();
            sc.nextLine();

            slumpTal = rand.nextInt(hogsta + 1);

            System.out.println("Gissa vilket tal jag tänker på mellan 0 och " + hogsta);
            boolean loop = true;
            while (loop) {
                int gissning = sc.nextInt();
                sc.nextLine();

                if (gissning < slumpTal) {
                    System.out.println("du gissade för lågt");
                    System.out.print("Gissa igen: ");
                } else if (gissning > slumpTal) {
                    System.out.println("du gissade för högt");
                    System.out.print("Gissa igen: ");
                } else if (gissning == slumpTal) {
                    System.out.println("\nDu gissade rätt! :D");
                    loop = false;
                }
            }
            System.out.println("\nVill du spela igen?");
            System.out.println("1. Ja");
            System.out.println("2. Nej");
            int spelaIgen = sc.nextInt();
            sc.nextLine();
            if(spelaIgen==2){
                spela=false;
            }
        }
    }
}
