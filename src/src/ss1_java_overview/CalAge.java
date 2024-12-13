package ss1_java_overview;

import java.time.Year;
import java.util.Scanner;

public class CalAge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("nhập vào năm sinh của bạn: ");
        int n = s.nextInt();

        System.out.println(Year.now().getValue() - n + " Tuổi");
    }
}
