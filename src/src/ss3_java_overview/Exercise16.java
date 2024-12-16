package ss3_java_overview;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            count++;
            for (int j = 0; j < count; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Hình 2");
        for (int i = 0; i <= n; i++) {
            count--;
            for (int j = 0; j <= count; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Hình 3");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Hình 4");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Hình 6");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                if (i == 1 || j == 1 || j == n - i + 1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Hình 5");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Hình 6");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i * 2 - 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
