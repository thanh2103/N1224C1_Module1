package Ss1_Java_Overview;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập tên sản phẩm: ");
        String tenSP = sc.nextLine();

        System.out.println("Nhập số lượng: ");
        int sl = sc.nextInt();

        System.out.println("Nhập đơn giá: ");
        int donGia = sc.nextInt();

        //câu a:
        System.out.println("Tiền: " + (sl * donGia));
        //câu b:
        System.out.println("Thuế giá trị gia tăng: " + (sl * donGia) * 0.1);
    }
}
