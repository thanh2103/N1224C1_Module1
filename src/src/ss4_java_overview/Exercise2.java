package ss4_java_overview;

import java.util.Scanner;

public class Exercise2 {
    //Đảo chuỗi
    public static int daoSo(int n) {
        int a = 0;

        while (n != 0) {
            int digit = n % 10;
            a = a * 10 + digit;
            n /= 10;
        }
        return a;
    }

    //Số đối xứng
    public static boolean soDoiXung(int number) {
        String str = String.valueOf(number);
        boolean isSoDoiXung = true;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("Không phải số đối xứng");
                isSoDoiXung = false;
                break;
            }
        }
        if (isSoDoiXung == true) {
            System.out.println("Đây là số đối xứng");

        }
        return isSoDoiXung;
    }

    // số chính phương
    public static boolean soChinhPhuong(int number) {

        return Math.sqrt(number) % 1 == 0;
    }

    //Số nguyên tố
    static boolean soNguyenTo(int number) {
        boolean isSoNguyenTo = true;
        for (int i = 1; i <= number; i++) {
            if (number < 2) {
                isSoNguyenTo = false;
                break;
            }
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    isSoNguyenTo = false;
                    break;
                }
            }
            if (isSoNguyenTo) {

            }
        }
        return isSoNguyenTo;
    }

    //tổng các số lẻ
    static int sumSoLe(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static int tongSoNguyenTo(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (soNguyenTo(digit)) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    //số chính phương
    static int tongSoChinhPhuong(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (soChinhPhuong(digit)) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // đảo số
        System.out.println("Nhập a: ");
        int n = scanner.nextInt();
        System.out.println("Đảo số:" + daoSo(n));

        // số đối xứng
        System.out.println();
        System.out.println("Số đối xứng");
        soDoiXung(n);

        System.out.println();
        System.out.print("Số chính phương: ");
        boolean soChinhPhuong = soChinhPhuong(n);
        if (soChinhPhuong == true) {
            System.out.println(n + " là số chính phương");
        } else {
            System.out.println(n + " không phải là số chính phương");
        }

        System.out.println();
        System.out.println("Số nguyên tố");
        System.out.println("Nhập số: ");

        boolean soNguyenTo = soNguyenTo(n);
        if (soNguyenTo == true) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không phải là số nguyên tố");
        }

        //tổng các số lẻ
        System.out.println();
        int sum = sumSoLe(n);
        System.out.println("tổng lẻ là: " + sum);

        //tổng các chữ số nguyên tố
        System.out.println();
        System.out.println("Tổng số nguyên tố");
        int sumNT = tongSoNguyenTo(n);
        System.out.println("Tổng số nguyên tố là: " + sumNT);

        // tổng các số chính phương
        System.out.println();
        System.out.println("Tổng số chính phương");
        int sumCP = tongSoChinhPhuong(n);
        System.out.println("Tổng số chinhs phương là: " + sumCP);
    }


}


