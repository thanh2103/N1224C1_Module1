package ss1_java_overview;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập bán kính: ");
        double r = sc.nextDouble();

        // Tính chu vi
        double C = 2 * Math.PI * r;

        //Tính diện tích
        double A = Math.PI * r * r;

        System.out.println("Chu vi hình tròn là: " + C);
        System.out.println("Diện tích hình tròn là: " + A);
    }
}
