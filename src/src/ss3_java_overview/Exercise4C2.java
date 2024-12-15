package ss3_java_overview;

import java.util.Scanner;

public class Exercise4C2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int a= 3;
        int count= 0;

        //vd nhập n=10
        //1: i=2 | 2<10 | i%2==0 | count=1 | =>2
        //2: i=3 | 3<10 |i%2!=0
        //3: i=4 | 4<10 |i%2==0 | count=2 | =>4
        //4: i=5 | 5<10 |i%2!=0
        //3: i=6 | 6<10 |i%2==0 | count=3 | =>-6 | count=0 lặp lại

        //for (int i = 2; i < n; i+=2) {}
        for (int i = 2; i < n; i++) {
            if(i%2==0){
                count++;

                if(count==a){
                    System.out.println(-i);
                    count=0;
                }else {
                    System.out.println(i);
                }
            }
        }

    }
}
