package ss3_java_overview;

import java.util.Scanner;

public class Exercise2 {
    //2. In dãy số lẻ từ 1 đến n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i+=2) {
//            if (i % 2 != 0) {
                System.out.println("Kết quả: " + i);
//            }
        }
    }
}
