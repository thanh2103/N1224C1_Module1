package ss2_java_overview;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thâm niên công tác: ");
        int n = scanner.nextInt();
        int luongCoBan = 650000;
        double heSoLuong;
        if (n < 12) {
            heSoLuong = 1.92;
        } else if (12 <= n && n < 36) {
            heSoLuong = 2.34;
        } else if (36 <= n && n < 60) {
            heSoLuong = 3;
        } else {
            heSoLuong = 4.5;
        }
        double Luong = luongCoBan * heSoLuong;
        System.out.println("Lương: " + Luong);
    }
}
