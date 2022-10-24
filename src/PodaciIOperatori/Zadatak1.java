package PodaciIOperatori;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Unesi prvi broj: ");
        a = s.nextInt();
        System.out.println("Unesi drugi broj: ");
        b= s.nextInt();

        c=a+b;
        System.out.println("Zbir unetih brojeva je: " + c);

    }
}
