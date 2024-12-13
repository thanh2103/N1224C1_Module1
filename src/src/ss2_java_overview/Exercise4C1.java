package ss2_java_overview;

import java.util.Scanner;

public class Exercise4C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("Nhập b: ");
        int b = sc.nextInt();
        int min, max;

        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}

