package ss3_java_overview;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println("Kết quả: " + i);
        }
    }
}
