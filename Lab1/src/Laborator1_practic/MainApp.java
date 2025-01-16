package Laborator1_practic;

import java.io.*;
import java.util.Scanner;

public class MainApp {
    public MainApp() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.println("Ati introdus valoarea: " + a);
        scanner.close();

        String nume_fis = "in.txt";

        Scanner scaner = new Scanner(new File(nume_fis));
        while (scaner.hasNextLine()) {
            System.out.println(scaner.nextLine());
        }
        scaner.close();

        String fiser = "out.txt";
        PrintStream flux_out = new PrintStream(fiser);
        flux_out.println();
    }

}


