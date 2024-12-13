package ss2_java_overview;

import java.util.Scanner;

public class Exercise4C2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập b: ");
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;
        int min = (b > a) ? a : b;

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }


}
