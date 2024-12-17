package ss3_java_overview;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền của đồ: ");
        int gia = scanner.nextInt();

        System.out.println("Nhập số tiền trả: ");
        int tra = scanner.nextInt();

        int tienThoiLai = tra - gia;
        int menhGiaTien;

        for (int i = tienThoiLai; i < 1; i++) {//
            int heSo = (int) Math.pow(10, i);
            menhGiaTien = 5000 * heSo;
            if (tienThoiLai > menhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoiLai / menhGiaTien, menhGiaTien);
                tienThoiLai %= menhGiaTien;
            }
            menhGiaTien = 2000 * heSo;
            if (tienThoiLai > menhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoiLai / menhGiaTien, menhGiaTien);
                tienThoiLai %= menhGiaTien;
            }
            menhGiaTien = 1000 * heSo;
            if (tienThoiLai > menhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoiLai / menhGiaTien, menhGiaTien);
                tienThoiLai %= menhGiaTien;
            }
        }
        System.out.println("Số tiền còn lại là: " + tienThoiLai);
    }
}
