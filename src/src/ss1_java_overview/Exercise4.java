package ss1_java_overview;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập điểm toán: ");
        double toan = sc.nextDouble();

        System.out.println("Nhập hệ số toán: ");
        double heToan = sc.nextDouble();

        System.out.println("Nhập điểm lý: ");
        double ly = sc.nextDouble();

        System.out.println("Nhập hệ số lý: ");
        double heLy = sc.nextDouble();

        System.out.println("Nhập điểm hóa: ");
        double hoa = sc.nextDouble();

        System.out.println("Nhập hệ số hóa: ");
        double heHoa = sc.nextDouble();

        double dtb = (toan * heToan + ly * heLy + hoa * heHoa) / (toan + ly + hoa);

        System.out.printf("Điểm trung bình là: " + dtb);
    }
}
