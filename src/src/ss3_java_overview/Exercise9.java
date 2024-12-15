package ss3_java_overview;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = scanner.nextInt();
        int a=1;
        int b=1;

        while (a<n){
            System.out.println(a*b);
            a=a*2+1;
            b=-b;
        }
    }
}
