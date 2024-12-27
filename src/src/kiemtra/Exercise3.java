package kiemtra;

import java.util.Scanner;

public class Exercise3 {
    private static boolean kiemTra(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = scanner.nextLine();
        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if (kiemTra(str.charAt(i))) {
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Chuỗi không chứa ký tự in hoa");
        } else {
            System.out.println(dem);
        }
    }

}
