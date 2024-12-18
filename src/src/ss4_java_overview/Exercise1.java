package ss4_java_overview;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Exercise1 {
    // Đổi chữ hoa thành chữ thường
    public static char toLowerCase(char s) {
        if (s >= 'A' && s <= 'Z') {
            s += 32;
        }
        return s;
    }

    //giải phương trình bậc nhất
    public static void giaiPTBN(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình vô số nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm là: " + -b / a);
        }
    }

    //Giải phương trình bậc 2

    public static void giaiPTBH(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / 2 * a;
        double x2 = (-b - Math.sqrt(delta)) / 2 * a;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm ");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình có nghiệm: " + -c / b);
            }
        } else {
            if (delta == 0) {
                System.out.println("Phương trình có 1 nghiệm kép: " + -b / (2 * a));
            } else if (delta > 0) {
                System.out.println("Phương trình có 2 nghiệm: " + x1 + " và " + x2);
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }

    public static int min(int a, int b, int c, int d) {
        int min = Math.min(a, b);
        min=Math.min(min,c);
        min=Math.min(min,d);
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ký tự: ");
        char s = scanner.next().charAt(0);

        char toLowerCase = toLowerCase(s);
        System.out.println(toLowerCase);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        giaiPTBN(a, b);

        System.out.println();
        System.out.println("Giải phương trình bậc 2");
        System.out.print("Nhập x: ");
        double x = scanner.nextDouble();
        System.out.print("Nhập y: ");
        double y = scanner.nextDouble();
        System.out.print("Nhập z: ");
        double z = scanner.nextDouble();
        giaiPTBH(x, y, z);

        System.out.println();
        System.out.println("Tìm số nhỏ nhất");
        System.out.println("Số 1: ");
        int x1= scanner.nextInt();
        System.out.println("Số 2: ");
        int x2= scanner.nextInt();
        System.out.println("Số 3: ");
        int x3= scanner.nextInt();
        System.out.println("Số 4: ");
        int x4= scanner.nextInt();

        int min=min(x1,x2,x3,x4);
        System.out.println("Số nhỏ nhất là: "+min);
    }
}
