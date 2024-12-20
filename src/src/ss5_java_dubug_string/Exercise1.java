package ss5_java_dubug_string;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = " Hello World ";

        System.out.println("Câu a: Lấy ra chữ world: " + str.substring(6));

        System.out.println("Câu b: Thay o bằng f: " + str.replaceAll("o", "f"));

        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                dem++;
            }
        }
        System.out.println("Câu c: đếm xem có bao nhiêu chữ l: " + dem);

        System.out.println("câu d: ");
        System.out.println("Vị trí đầu tiên: " + str.indexOf('l'));
        System.out.println("Vị trí cuối cùng: " + str.lastIndexOf('l'));

        System.out.println("e. xóa hết space ở đầu, giữa, cuối: " + str.replaceAll(" ", ""));

        System.out.println("f. xóa hết space ở đầu và cuối:" + str.trim());

        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 +=str.charAt(i);
        }
        System.out.println("g. đảo chuỗi: "+str1);

        String str2 = "SQC";
        String str3= str2.concat(str);
        System.out.println("h. nối chuỗi: "+str3);

        System.out.println("i. chuyển sang chữ hoa: "+str3.toUpperCase(Locale.ROOT));

        System.out.println("k. chuyển sang chữ thường: "+str3.toLowerCase(Locale.ROOT));


        System.out.print("Nhập n: ");
        int n= scanner.nextInt();
        System.out.print("Nhập m: ");
        int m=scanner.nextInt();
        System.out.println("l. trích chuỗi con từ n đến m: "+str.substring(n,m));
    }
}
