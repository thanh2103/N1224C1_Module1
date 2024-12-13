package ss2_java_overview;

import java.util.Scanner;

public class Exercise3C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = sc.nextInt();

        System.out.print("Nhập b: ");
        int b = sc.nextInt();

        //a b   temp
        //a b   0
        //
        //0 b   a
        //b 0   a
        //b a   0
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
}
