package ss3_java_overview;

import java.util.Scanner;

public class Exercise3 {
    //3. (*) In dãy số chẵn từ 2 đến n với giá trị dương, âm xen kẽ
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        //vd nhập n=7;
        //1: i=2 | i<n | 2%4!=0 | => 2
        //2: i=4 | i<n | 4%4==0 | =>-4
        //6: I=6 | i<n | 6%4!=0 | => 6

        for (int i = 2; i < n; i += 2) {
            if (i % 4 == 0) {
                System.out.println(-i);
            } else {
                System.out.println(i);
            }
        }
    }
}
