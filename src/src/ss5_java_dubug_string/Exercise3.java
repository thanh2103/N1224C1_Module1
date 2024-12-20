package ss5_java_dubug_string;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi a: ");
        String a = scanner.nextLine();
        System.out.println("Nhập chuỗi b: ");
        String b = scanner.nextLine();

        int soSanh = a.compareTo(b);
        if (soSanh == 0) {
            System.out.println("Chuỗi a = chuỗi b");
        } else if (soSanh > 0) {
            System.out.println("Chuỗi a < chuỗi b");
        } else {
            System.out.println("Chuỗi a > chuỗi b");
        }
    }
}
