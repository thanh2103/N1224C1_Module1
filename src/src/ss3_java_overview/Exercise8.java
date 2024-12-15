package ss3_java_overview;

import java.util.Scanner;

//8. In dãy số 1, 3, 7, 15, 31, ... n
// a*2+1
public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int a=0;
        while (a<n){
            System.out.println(a);
            a=a*2+1;
        }
    }
}
