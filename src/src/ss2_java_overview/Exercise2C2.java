package ss2_java_overview;

import java.util.Scanner;

public class Exercise2C2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Nhập số n: ");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
            case 10:
                System.out.println("Mười");
                break;
            default:
                System.out.println("Không hợp lí");
        }
    }
}
