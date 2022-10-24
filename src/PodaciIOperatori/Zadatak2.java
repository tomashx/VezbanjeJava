package PodaciIOperatori;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesi poluprecnik kruga: ");
        double r = s.nextDouble();

        double P = Math.pow(r, 2) * Math.PI;

        System.out.println("Povrsina kruga je: " + P);

        double O = (2 * r)*Math.PI;

        System.out.println("Obim kruga je: " + O);
    }
}
