package ss2_java_overview;

import java.util.Scanner;


public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        double kq;
        double delta = b * b - a * a * c;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                kq = -b / a;
                System.out.println("Phương trình có kết quả là: " + kq);
            }
        } else {
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                kq = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: " + kq);
            } else {

                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có nghiệm 1 là: " + x1);
                System.out.println("Phương trình có nghiệm 2 là: " + x2);
            }
        }
    }
}
