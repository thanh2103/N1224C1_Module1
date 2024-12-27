package ss6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1b {
    static boolean soNguyenTo(int number) {
        boolean isSoNguyenTo = true;
        for (int i = 1; i <= number; i++) {
            if (number < 2) {
                isSoNguyenTo = false;
                break;
            }
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    isSoNguyenTo = false;
                    break;
                }
            }
            if (isSoNguyenTo) {

            }
        }
        return isSoNguyenTo;
    }

    public static void main(String[] args) {
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
        ArrayList<Integer> list = new ArrayList<>();
        inPutPutArr(list, n);
        outPutPutArr(list);
        for (int i = 0; i < list.size(); i++) {
            if (soNguyenTo(list.get(i))) {
                list.add(i,0);
                i++;
            }
        }
        System.out.println("thêm số 0 vào trước số nguyên tố: "+list);
    }
    private static void inPutPutArr(ArrayList<Integer> list, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử mảng [%d]: ", i);
            list.add(scanner.nextInt());
        }
    }
    private static void outPutPutArr(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
    }
}
