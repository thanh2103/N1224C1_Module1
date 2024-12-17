package ss3_java_overview;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {//hàng
            for (int j = 1; j <= n; j++) {//cột
                if (i == 1 || i == n || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");// khoảng trống
                }
            }
            System.out.println();
        }
        System.out.println("hình 3");
        for (int i = 1; i <= n; i++) {//hàng
            for (int j = 1; j <= n; j++) {//cột
                if (i == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");// khoảng trống
                }
            }
            System.out.println();
        }
        System.out.println("hình 4");
        for (int i = 1; i <= n; i++) {//hàng
            for (int j = 1; j <= n; j++) {//cột
                if (i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");// khoảng trống
                }
            }
            System.out.println();
        }//
    }
}
