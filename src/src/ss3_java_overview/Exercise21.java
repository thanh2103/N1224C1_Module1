package ss3_java_overview;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = scanner.nextInt();

//        String a = String.valueOf(n);
//       // String b = "";
//        while (n > 0) {
//            a += n % 10;
//            n /= 10;
//        }
//        System.out.println(a);
//        while (n > 0) {
//            b = n % 10 + b;
//            n /= 10;
//        }
// //       System.out.println(b);
//        if (==n) {
//            System.out.println(n + " Là số đối xứng");
//        } else {
//            System.out.println("Không phải số đối xứng");
//        }
        System.out.println("Câu a: ");
        String str = String.valueOf(n);
        boolean isSoDoiXung = true;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("Không phải số đối xứng");
                isSoDoiXung = false;
                break;
            }

        }
        if (isSoDoiXung == true) {
            System.out.println("Đây là số đối xứng");

        }
//--------------------------------------------------------------
        System.out.println();
        System.out.println("Câu b: ");

        boolean isSoNguyenTo = true;

        if (n < 2) {
            isSoNguyenTo = false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " không phải là số nguyên tố");
                isSoNguyenTo = false;
                break;
            }
        }
        if (isSoNguyenTo) {
            System.out.println(n + " là số nguyên tố");
        }
//--------------------------------------------------------------

        System.out.println();
        System.out.println("Câu b- cách 2: ");

        //--------------------------------------------------------------
        System.out.println();
        System.out.println("Câu c: ");

        String c = String.valueOf(n);
        boolean isSoTangDan = true;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) >= str.charAt(i + 1)) {
                System.out.println(n + " đây không phải là số tăng dần");
                isSoTangDan = false;
                break;
            }
        }
        if (isSoTangDan) {
            System.out.println(n + " đây là số tăng dần");
        }
    }
}
