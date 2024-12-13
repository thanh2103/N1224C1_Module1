package ss2_java_overview;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số n: ");
        int n = scanner.nextInt();
        double check = Math.sqrt(n);
        int kq;
        if (check % 1 == 0) {
            kq = n;
            System.out.println(kq + " là số chính phương");
        } else {
            System.out.println("Không phải số chính phương");
        }
    }
}
