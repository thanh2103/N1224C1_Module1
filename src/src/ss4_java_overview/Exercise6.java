package ss4_java_overview;

import java.util.Scanner;

public class Exercise6 {
    static String tenNV;
    static int tuoi;
    static String gioiTinh;
    static double mucLuongCoBan, diemTBTotNghiep;

    static void nhapTT() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        tenNV = s.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = s.nextInt();
        s.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = s.nextLine();
        System.out.print("Nhập mức lượng cơ bản: ");
        mucLuongCoBan = s.nextDouble();
        System.out.print("Nhập điểm trung bình tốt nghiệp: ");
        diemTBTotNghiep = s.nextDouble();
    }

    static void xuatTT() {
        System.out.println("Họ và tên: " + tenNV);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Mức lương cơ bản: " + mucLuongCoBan);
        System.out.println("điểm trung bình: " + diemTBTotNghiep);
    }

    public static void main(String[] args) {
        nhapTT();
        xuatTT();
    }
}
