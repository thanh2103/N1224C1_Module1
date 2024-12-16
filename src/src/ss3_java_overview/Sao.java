package ss3_java_overview;

import java.util.Scanner;

public class Sao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cạnh: ");
        int canh = scanner.nextInt();

        for(int i = 0; i < canh; i++) {
            for(int j = 0; j < canh; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
