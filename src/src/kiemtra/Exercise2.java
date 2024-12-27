package kiemtra;

import java.util.Scanner;

public class Exercise2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap vao so luong phan tu cua mang: ");
            n = scanner.nextInt();
        } while (n < 1);
        //buoc 2: new mang
        int[] arr = new int[n];
        //buoc 3: nhap mang
        inputArray(arr, scanner);
        //buoc 4: xuat mang
        outputArray(arr);
        System.out.println("Tổng chẵn: " + sumChan(arr));
        System.out.println("Tổng lẻ: " + sumLe(arr));
        System.out.printf("%d-%d=%d", sumChan(arr), sumLe(arr), sumChan(arr) - sumLe(arr));

    }

    private static void inputArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao phan tu a[%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }

    private static void outputArray(int[] arr) {
        // foreach
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }

    private static int sumChan(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static int sumLe(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

}
