package ss3_java_overview;

import java.util.Scanner;

public class Exercise13C2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int ucln = 1;
        if (max % min == 0) {
            ucln = min;
        } else {
            for (int i = min / 2; i >= 1; i--) {
                if (a % 1 == 0 && b % 1 == 0) {
                    ucln = 1;
                    break;
                }
            }
        }
        int bcnn = 1;
        for (int i = max; true; i += max) {
            if (i % min == 0) {
                ucln = i;
                break;
            }
        }
        System.out.println("Ước chung lớn nhất: " + ucln);
        System.out.println("Bội chung nhỏ nhất: " + bcnn);
    }
}
