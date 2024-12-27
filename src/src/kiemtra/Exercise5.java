package kiemtra;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
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
        sapXep(list);

        System.out.println("Số lớn nhì: " + list.get(n - 1 - 1));
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

    private static void sapXep(ArrayList<Integer> list) {
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                int temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
            }
        }
    }
//    private static int sapXep(ArrayList<Integer> list) {
//        int c;
//        for (int i = 0; i < list.size()-1; i++) {
//            int a = list.get(i);
//            int b = list.get(i + 1);
//            if (a >= b) {
//                continue;
//            } else {
//                c=b;
//            }
//            c=b;
//        }
//        return c;
//    }


}