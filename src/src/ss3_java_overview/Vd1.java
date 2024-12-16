package ss3_java_overview;

import java.util.Scanner;

public class Vd1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count++;
            for (int j = 1; j <= count; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
