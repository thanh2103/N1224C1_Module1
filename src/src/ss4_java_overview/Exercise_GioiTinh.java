package ss4_java_overview;

import java.util.Scanner;

public class Exercise_GioiTinh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choose = scanner.nextInt();
// với giới tính là:Nam hoặc Nữ
//        do {
//            System.out.println("Vui lòng chọn giới tính: ");
//            System.out.println("1. Nam");
//            System.out.println("2. Nữ");
//
//            System.out.println("Mời bạn chọn giới tính: ");
//
//            if (choose != 1 && choose != 2) {
//                System.out.println("Nhập sai vui lòng nhập lại!");
//            }
//        } while (choose != 1 && choose != 2);
//
//        boolean isNam = choose == 1;
//
//        System.out.println("Giới tính: " + (isNam ? "Nam" : "Nữ"));
        // với giới tính là: Nam, Nữ, Khác
        System.out.println("Vui lòng chọn giới tính: ");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        do {
            System.out.println("Mời bạn chọn giới tính: ");

            if (choose < 0 || choose > 3) {
                System.out.println("Nhập sai vui lòng nhập lại!");
            }
        } while (choose < 0 || choose > 3);

        if (choose == 1) {
            System.out.println("Nam");
        } else if (choose == 2) {
            System.out.println("Nữ");
        } else {
            System.out.println("Khác");
        }
    }
}
