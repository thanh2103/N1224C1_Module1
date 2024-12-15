package ss3_java_overview;

import java.util.Scanner;

//6. (**) In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int a = 0;
        int count = 2;

        for (int i = 2; i <= n; i += 2) {
            a++;
            if (count == a) {
                System.out.println(-i);
                a = 0;
                count++;
            } else {
                System.out.println(i);
            }

        }
    }
}
