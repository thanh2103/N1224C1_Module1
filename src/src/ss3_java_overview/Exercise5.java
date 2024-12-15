package ss3_java_overview;

import java.util.Scanner;

public class Exercise5 {
    //5. (*) In dãy số chẵn từ 2 đến 2n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        for (int i = 2; i < 2 * n; i += 2) {
            System.out.println(i);
        }
    }
}
