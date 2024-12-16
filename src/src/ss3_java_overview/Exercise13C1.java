package ss3_java_overview;

import java.util.Scanner;

public class Exercise13C1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();

        int ucln = 1;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
                break;
            }
        }
        int bcnn=1;
        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                ucln = i;
                break;
            }
        }
        System.out.println("UCLN: " + ucln);
        System.out.println("BCNN: " + bcnn);
    }
}
