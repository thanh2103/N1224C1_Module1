package ss3_java_overview;

import java.util.Scanner;

public class Exercise20 {
    //20. Tính tổng giai thừa của 3 số nguyên dương
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập c: ");
        int c = scanner.nextInt();
        int giaiThuaA = 1, giaiThuaB = 1, giaiThuaC = 1;
        for (int i = 1; i <= a; i++) {
            giaiThuaA *= i;
        }

        for (int i = 1; i <= b; i++) {
            giaiThuaB *= i;
        }

        for (int i = 1; i <= c; i++) {
            giaiThuaC *= i;
        }
        int kq = giaiThuaA + giaiThuaB + giaiThuaC;
        System.out.printf("%d + %d + %d = %d", giaiThuaA, giaiThuaB, giaiThuaC, kq);//
    }

}

