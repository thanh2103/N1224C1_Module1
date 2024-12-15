package ss3_java_overview;

import java.util.Scanner;

public class Exercise4C1 {
    //4. In dãy số chẵn từ 2 đến n với giá trị dương, âm xen kẽ mỗi 3 số
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        for (int i = 2; i < n; i += 2) {
            if (i % 6 == 0) {
                System.out.println(-i);
            } else {
                System.out.println(i);
            }
        }
    }
}
