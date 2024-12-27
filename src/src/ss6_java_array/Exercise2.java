package ss6_java_array;

import java.util.Scanner;

public class Exercise2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("nhập số lượng nhân viên: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] ten = new String[n];
        int[] tuoi = new int[n];
        int[] gioiTinh = new int[n];
        double[] luong = new double[n];
        double[] diemTB = new double[n];
        inPut(ten, tuoi, gioiTinh, luong, diemTB, n);
        outPut(ten, tuoi, gioiTinh, luong, diemTB, n);
    }

    private static void inPut(String[] ten, int[] tuoi, int[] gioiTinh, double[] luong, double[] diemTB, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập tên nhân viên thứ %d: ", i + 1);
            ten[i] = sc.nextLine();
            System.out.printf("Nhập tuổi nhân viên thứ %d: ", i + 1);
            tuoi[i] = Integer.parseInt(sc.nextLine());
            do {
                System.out.printf("Chọn giới tính nhân viên thứ %d \n1. Nam\n2. Nữ\n3. Khác \nLựa chọn của bạn là: ", i + 1);
                gioiTinh[i] = Integer.parseInt(sc.nextLine());
                if (gioiTinh[i] > 3 || gioiTinh[i] < 1) {
                    System.out.println("Giới tính không hợp lệ, vui lòng nhập lại!");
                }
            } while (gioiTinh[i] > 3 || gioiTinh[i] < 1);
            System.out.printf("Nhập lương nhân viên thứ %d: ", i + 1);
            luong[i] = Double.parseDouble(sc.nextLine());
            do {
                System.out.printf("Nhập điểm trung bình nhân viên thứ %d: ", i + 1);
                diemTB[i] = Double.parseDouble(sc.nextLine());
                if (diemTB[i] < 0 || diemTB[i] > 10) {
                    System.out.println("Điểm trung bình không hợp lệ, vui lòng nhập lại!");
                }//
            } while (diemTB[i] < 0 || diemTB[i] > 10);
        }
    }

    private static void outPut(String[] ten, int[] tuoi, int[] gioiTinh, double[] luong, double[] diemTB, int n) {
        System.out.println("Danh sách nhân viên: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("======Nhân viên thứ %d======\n", i + 1);
            System.out.println("Tên: " + ten[i]);
            System.out.println("Tuổi: " + tuoi[i]);
            System.out.println("Giới tính: " + ((gioiTinh[i] == 1) ? "Nam" : gioiTinh[i] == 2 ? "Nữ" : "Khác"));
            System.out.println("Lương: " + luong[i]);
            System.out.println("Điểm trung bình: " + diemTB[i]);
        }
    }
}
