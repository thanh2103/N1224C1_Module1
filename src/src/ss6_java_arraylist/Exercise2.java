package ss6_java_arraylist;

import javax.xml.stream.events.DTD;
import java.util.Scanner;

public class Exercise2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String ten[] = new String[5];
        int tuoi[] = new int[5];
        String gioiTinh[] = new String[5];
        double luong[] = new double[5];
        double diemTB[] = new double[5];
        inPut(ten,tuoi,gioiTinh,luong,diemTB);
        outPut(ten,tuoi,gioiTinh,luong,diemTB);


    }

    private static void inPut(String[] ten, int[] tuoi, String[] gioiTinh, double[] luong, double[] diemTB) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            System.out.print("Tên NV: ");
            ten[i] = scanner.nextLine();
            System.out.print("Tuổi NV: ");
            tuoi[i] = scanner.nextInt();
            System.out.print("Giới Tính NV: ");
            gioiTinh[i] = scanner.nextLine();
            System.out.print("Lương: ");
            luong[i] = scanner.nextDouble();
            System.out.print("ĐTB: ");
            diemTB[i] = scanner.nextDouble();
        }
    }

    private static void outPut(String[] ten, int[] tuoi, String[] gioiTinh, double[] luong, double[] diemTB) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhân viên thứ " + (i + 1) + ":");
            System.out.println("Tên: " + ten[i]);
            System.out.println("Tuổi " + tuoi[i]);
            System.out.println("Giới tính " + gioiTinh[i]);
            System.out.println("Lương " + luong[i]);
            System.out.println("Điểm trung bình " + diemTB[i]);
        }
    }
}
