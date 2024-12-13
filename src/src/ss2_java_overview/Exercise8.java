package ss2_java_overview;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.println("Nhập năm: ");
        int year = scanner.nextInt();
        int day;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
            default:
                day = 30;
                break;

        }
        System.out.println("Số ngày:" + day);
    }
}
