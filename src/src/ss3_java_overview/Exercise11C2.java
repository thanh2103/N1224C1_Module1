package ss3_java_overview;

import java.util.Scanner;

public class Exercise11C2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        double sum = 0.0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / fact;
            fact *= (2 * i) * (2 * i + 1);
        }
        System.out.println("Tổng s= "+sum);
    }
}
