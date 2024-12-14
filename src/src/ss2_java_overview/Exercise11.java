package ss2_java_overview;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ngày: ");
        int day = scanner.nextInt();

        System.out.println("Nhập tháng: ");
        int month = scanner.nextInt();

        System.out.println("Nhập năm: ");
        int year = scanner.nextInt();

        if (day < 1 || day > 31) {
            System.out.println("Ngày không hợp lệ");
        }
        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ");
        }
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (month == 2) {
            if (isLeapYear) {
                if (day > 29) {
                    System.out.println("Ngày không hợp lệ");
                    return;
                }
            } else {
                if (day > 28) {
                    System.out.println("Ngày không hợp lệ");
                    return;
                }
            }
        }
        System.out.println("Ngày hợp lệ!");
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        nextDay++;
        if ((nextDay > 31) || (month == 2 && nextDay > (isLeapYear ? 29 : 28)) ||
                (month == 4 || month == 6 || month == 9 || month == 11 || month == 12) && nextDay > 30) {
            nextDay = 1;
            nextMonth++;
        }

        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }
        System.out.printf("Ngày kế tiếp: %d/%d/%d", nextDay, nextMonth, nextYear);

        int previousDay = day;
        int previousMonth = month;
        int previousYear = year;
        previousDay--;

        if (previousDay < 1) {
            previousMonth--;
            if (previousMonth < 1) {
                previousYear--;
            }

            if (previousDay < 1 && previousMonth == 4 || previousMonth == 6 || previousMonth == 9 || previousMonth == 11 || previousMonth == 12) {
                previousDay = 30;
            } else if (previousDay == 2) {
                if (isLeapYear) {
                    previousDay = 29;
                } else {
                    previousDay = 28;
                }
            } else {
                previousDay = 31;
            }
        }
        //
        System.out.printf("Ngày trước đó là: %d/%d/%d", previousDay, previousMonth, previousYear);
    }
}
