package Ss1_Java_Overview;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a:");
        int a = sc.nextInt();
        System.out.println("nhập b:");
        int b = sc.nextInt();
        System.out.println("tổng 2 số là: " + (a + b));
        System.out.println("Hiệu 2 số là: " + (a - b));
        System.out.println("Tích 2 số là: " + (a * b));
        if (b == 0) {
            System.out.println("không thực hiện được");
        } else {
            System.out.println("Thương của 2 số là: " + ((double) a / b));
        }
    }
}
