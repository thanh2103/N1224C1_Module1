package ss2_java_overview;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chữ cái: ");
        char ch = scanner.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
            } else {
                ch += 32;
            }
        } else {
            System.out.println("Vui lòng nhập chữ cái!");
        }
        System.out.println("Chữ cái sau khi chuyển: " + ch);
    }
}
