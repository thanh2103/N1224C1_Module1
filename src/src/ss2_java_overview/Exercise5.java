package ss2_java_overview;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        double kq;

        // ax+b=0
        //a=0: vô nghiệm
        //(a>0)&(b=0): x=0
        //(a>0)&(b!=0): x=-b/a;
        System.out.println("----------If-else----------");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            kq = -b / a;
            System.out.println("Phương trình có kết quả là: " + kq);
        }
    }
}
