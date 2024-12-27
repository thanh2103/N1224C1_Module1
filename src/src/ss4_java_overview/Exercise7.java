package ss4_java_overview;

import java.util.Scanner;

public class Exercise7 {
    static String tenNV1;
    static int tuoi1;
    static String gioiTinh1;
    static double mucLuongCoBan1, diemTBTotNghiep1;

    static String tenNV2;
    static int tuoi2;
    static String gioiTinh2;
    static double mucLuongCoBan2, diemTBTotNghiep2;

    static String tenNV3;
    static int tuoi3;
    static String gioiTinh3;
    static double mucLuongCoBan3, diemTBTotNghiep3;

    static String tenNV4;
    static int tuoi4;
    static String gioiTinh4;
    static double mucLuongCoBan4, diemTBTotNghiep4;

    static String tenNV5;
    static int tuoi5;
    static String gioiTinh5;
    static double mucLuongCoBan5, diemTBTotNghiep5;


    static void nhapTT1() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        tenNV1 = s.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi1 = s.nextInt();
        s.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh1 = s.nextLine();
        System.out.print("Nhập mức lượng cơ bản: ");
        mucLuongCoBan1 = s.nextDouble();
        System.out.print("Nhập điểm trung bình tốt nghiệp: ");
        diemTBTotNghiep1 = s.nextDouble();
    }

    static void nhapTT2() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        tenNV2 = s.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi2 = s.nextInt();
        s.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh2 = s.nextLine();
        System.out.print("Nhập mức lượng cơ bản: ");
        mucLuongCoBan2 = s.nextDouble();
        System.out.print("Nhập điểm trung bình tốt nghiệp: ");
        diemTBTotNghiep2 = s.nextDouble();
    }

    static void nhapTT3() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        tenNV3 = s.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi3 = s.nextInt();
        s.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh3 = s.nextLine();
        System.out.print("Nhập mức lượng cơ bản: ");
        mucLuongCoBan3 = s.nextDouble();
        System.out.print("Nhập điểm trung bình tốt nghiệp: ");
        diemTBTotNghiep3 = s.nextDouble();
    }

    static void nhapTT4() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        tenNV4 = s.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi4 = s.nextInt();
        s.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh4 = s.nextLine();
        System.out.print("Nhập mức lượng cơ bản: ");
        mucLuongCoBan4 = s.nextDouble();
        System.out.print("Nhập điểm trung bình tốt nghiệp: ");
        diemTBTotNghiep4 = s.nextDouble();
    }

    static void nhapTT5() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        tenNV5 = s.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi5 = s.nextInt();
        s.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh5 = s.nextLine();
        System.out.print("Nhập mức lượng cơ bản: ");
        mucLuongCoBan5 = s.nextDouble();
        System.out.print("Nhập điểm trung bình tốt nghiệp: ");
        diemTBTotNghiep5 = s.nextDouble();
    }

    static void xuatTT1() {
        System.out.println("Họ và tên: " + tenNV1);
        System.out.println("Tuổi: " + tuoi1);
        System.out.println("Giới tính: " + gioiTinh1);
        System.out.println("Mức lương cơ bản: " + mucLuongCoBan1);
        System.out.println("điểm trung bình: " + diemTBTotNghiep1);
    }

    static void xuatTT2() {
        System.out.println("Họ và tên: " + tenNV2);
        System.out.println("Tuổi: " + tuoi2);
        System.out.println("Giới tính: " + gioiTinh2);
        System.out.println("Mức lương cơ bản: " + mucLuongCoBan2);
        System.out.println("điểm trung bình: " + diemTBTotNghiep2);
    }

    static void xuatTT3() {
        System.out.println("Họ và tên: " + tenNV3);
        System.out.println("Tuổi: " + tuoi3);
        System.out.println("Giới tính: " + gioiTinh3);
        System.out.println("Mức lương cơ bản: " + mucLuongCoBan3);
        System.out.println("điểm trung bình: " + diemTBTotNghiep3);
    }

    static void xuatTT4() {
        System.out.println("Họ và tên: " + tenNV4);
        System.out.println("Tuổi: " + tuoi4);
        System.out.println("Giới tính: " + gioiTinh4);
        System.out.println("Mức lương cơ bản: " + mucLuongCoBan4);
        System.out.println("điểm trung bình: " + diemTBTotNghiep4);
    }

    static void xuatTT5() {
        System.out.println("Họ và tên: " + tenNV5);
        System.out.println("Tuổi: " + tuoi5);
        System.out.println("Giới tính: " + gioiTinh5);
        System.out.println("Mức lương cơ bản: " + mucLuongCoBan5);
        System.out.println("điểm trung bình: " + diemTBTotNghiep5);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên muốn nhập: ");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("Nhân viên thứ 1");
                nhapTT1();
                System.out.println("Thông tin nhân viên thứ 2");
                xuatTT1();
                break;
            case 2:
                System.out.println("Nhân viên thứ 1");
                nhapTT1();
                System.out.println("Nhân viên thứ 2");
                nhapTT2();
                System.out.println("Thông tin nhân viên thứ 1");
                xuatTT1();
                System.out.println("Thông tin nhân viên thứ 2");
                xuatTT2();
                break;
            case 3:
                System.out.println("Nhân viên thứ 1");
                nhapTT1();
                System.out.println("Nhân viên thứ 2");
                nhapTT2();
                System.out.println("Nhân viên thứ 3");
                nhapTT3();
                System.out.println("Thông tin nhân viên thứ 1");
                xuatTT1();
                System.out.println("Thông tin nhân viên thứ 2");
                xuatTT2();
                System.out.println("Thông tin nhân viên thứ 3");
                xuatTT3();
                break;
            case 4:
                System.out.println("Nhân viên thứ 1");
                nhapTT1();
                System.out.println("Nhân viên thứ 2");
                nhapTT2();
                System.out.println("Nhân viên thứ 3");
                nhapTT3();
                System.out.println("Nhân viên thứ 4");
                nhapTT4();
                System.out.println("Thông tin nhân viên thứ 1");
                xuatTT1();
                System.out.println("Thông tin nhân viên thứ 2");
                xuatTT2();
                System.out.println("Thông tin nhân viên thứ 3");
                xuatTT3();
                System.out.println("Thông tin nhân viên thứ 4");
                xuatTT4();
                break;
            case 5:
                System.out.println("Nhân viên thứ 1");
                nhapTT1();
                System.out.println("Nhân viên thứ 2");
                nhapTT2();
                System.out.println("Nhân viên thứ 3");
                nhapTT3();
                System.out.println("Nhân viên thứ 4");
                nhapTT4();
                System.out.println("Nhân viên thứ 5");
                nhapTT5();
                System.out.println("Thông tin nhân viên thứ 1");
                xuatTT1();
                System.out.println("Thông tin nhân viên thứ 2");
                xuatTT2();
                System.out.println("Thông tin nhân viên thứ 3");
                xuatTT3();
                System.out.println("Thông tin nhân viên thứ 4");
                xuatTT4();
                System.out.println("Thông tin nhân viên thứ 5");
                xuatTT5();
                break;
        }

    }

}
