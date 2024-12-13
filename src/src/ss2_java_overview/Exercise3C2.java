package ss2_java_overview;

import java.util.Scanner;

public class Exercise3C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập a: ");
        int a = sc.nextInt();

        System.out.println("Nhập b: ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
