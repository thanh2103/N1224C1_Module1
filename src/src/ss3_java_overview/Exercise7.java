package ss3_java_overview;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        while (fn <= n) {
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }
}
