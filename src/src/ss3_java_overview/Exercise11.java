package ss3_java_overview;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        double sum = 0.0;

        // n=4
        //i=1<4 | i=1=1 |
        int i = 1;
        while ( i <= n) {
            int fact = 1;

            for (int j = 1; j <= (2 * i - 1); j++) {
                fact *= j;
            }

            sum += 1.0 / fact;
            i++;
        }
        System.out.println("Kết quả: " + sum);
    }
}
