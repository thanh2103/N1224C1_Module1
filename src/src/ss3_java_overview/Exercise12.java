package ss3_java_overview;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();

        int S = 0;
        int C = 1;

        while (n > 0) {
            int a = n % 10;
            S += a;
            C *= a;
            n /= 10;
        }
        System.out.println("Tổng: " + S);
        System.out.println("Tích: " + C);
    }
}
