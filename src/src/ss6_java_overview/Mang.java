package ss6_java_overview;

import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        // B1: Nhập số lượng phần tử mảng
        //b2: new mang
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Nhâp vào số lượng phần tử của mảng: ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("Số lượng phần tử mảng không hợp lệ ");
            }
        } while (n < 1);

        int[] arr = new int[n];

        //b3: Nhập mảng
        inPutPutArr(n, arr, scanner);

        //b4: Xuất mảng
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+"\t");
        }
        isToanChan(arr);
        //Kiểm tra mảng toàn chẵn


    }
// chọn Refactor->Actraxt Method : gom hàm
    private static void inPutPutArr(int n, int[] arr, Scanner scanner) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử mảng [%d]: " , i);
            arr[i] = scanner.nextInt();
        }
    }
    static boolean isToanChan(int []arr){
        for (int j : arr) {
            if (j % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}

//sử dụng foreach trong trường hợp không quan tâm đến index

