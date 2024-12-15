package ss3_java_overview;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();

        double sum=0;
        for (int i=1; i<=n; i++) {
            sum+=1.0/i;

        }
        System.out.println(sum);
    }
}
