import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int p = 0;
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati lungimea: ");
        int lungime = scanner.nextInt();
        System.out.println("Dati latimea: ");
        int latime = scanner.nextInt();
        if(lungime != 0 && latime != 0)
        {
            p = (2 * lungime) + (2 * latime);
            a = lungime * latime;
            System.out.println("Perimetrul dreptunghiului: " + p);
            System.out.println("Aria dreptunghiului: " + a);
        }
    }
}