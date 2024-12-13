package ss1_java_overview;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập biển số xe: ");
        int n = scanner.nextInt();//vd:23456

        int sum = n % 10;//=2345,6=>6
        n = n / 10;//=>2345
        sum = sum + n % 10;//6+5(234,5)=11
        n = n / 10;//234
        sum = sum + n % 10;//11+4
        n = n / 10;//23
        sum = sum + n % 10;//15+3
        n = n / 10;//2
        sum = sum + n;//18+2

        int soNut = sum % 10;

        System.out.println("Số nút là: "+soNut);

    }
}
