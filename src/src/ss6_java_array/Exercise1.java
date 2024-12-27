package ss6_java_array;

import java.util.Scanner;

public class Exercise1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // buoc 1: nhap so luong cua mang
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap vao so luong phan tu cua mang: ");
            n = sc.nextInt();
        } while (n < 1);
        //buoc 2: new mang
        int[] arr = new int[n];
        //buoc 3: nhap mang
        inputArray(arr, sc);
        //buoc 4: xuat mang
        outputArray(arr);
        System.out.println("Mảng toàn chẵn: "+isAllEven(arr));
        System.out.println("Toàn là số nguyên tố: "+isFullPrime(arr));
        System.out.println("Mảng toàn tăng: "+isTang(arr));
        System.out.println("Lẻ: "+demSoLe(arr));
        System.out.println("tính tổng số dương lẻ: "+sumDuongLe(arr));
        System.out.println("bao nhieu so chia het cho 4 nhung khong chia het cho 5"+countDivisible4Not5(arr));
        System.out.println("Tong cac so nguyen to: " + sumPrimes(arr));
        System.out.println("Vi tri cuoi cung cua x: " + lastIndexOfX(arr, 5));
        System.out.println("Vi tri dau tien cua so nguyen to: " + firstPrimeIndex(arr));
        System.out.println("So duong nho nhat: " + minPositive(arr));

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
            System.out.println(arr[i]+"\t");
        }

    }
    private static boolean isAllEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    private static boolean isFullPrime(int[] arr) {
        for (int num : arr) {
            if (!isSoNguyenTo(num))
                return false;
        }
        return true;
    }
    private static boolean isSoNguyenTo(int num) {
        if(num<=1) return false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isTang(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    private static int demSoLe(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
private static int sumDuongLe(int[] arr) {
    int sum = 0;
    for (int num : arr) {
        if (num > 0 && num % 2 != 0) {
            sum += num; // Cộng vào tổng nếu số dương và lẻ
        }
    }
    return sum;
}
//bao nhieu so chia het cho 4 nhung khong chia het cho 5
private static int countDivisible4Not5(int[] array) {
    int count = 0;
    for (int num : array) {
        if (num % 4 == 0 && num % 5 != 0) {
            count++;
        }
    }
    return count;
}
    //3d. tinh tong cac so nguyen to trong mang
    private static int sumPrimes(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (isSoNguyenTo(num)) {
                sum += num;
            }
        }
        return sum;
    }
    //4a. vi tri cuoi cung cua phan tu x trong mang
    private static int lastIndexOfX(int[] array, int x) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }
    //4b. vi tri so nguyen to dau tien trong mang
    private static int firstPrimeIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isSoNguyenTo(array[i])) {
                return i;
            }
        }
        return -1;
    }
    //4c. tim so duong nho nhat trong mang
    private static int minPositive(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        return min;
    }
    //4d. nhap vao phan tu k, tim k co xuat hien khong
    private static boolean contains(int[] array, int k) {
        for (int num : array) {
            if (num == k) {
                return true;
            }
        }
        return false;
    }
    //4e. tim gia tri lon nhat va nho nhat cua mang
    private static int[] minMax(int[] array) {
        if (array.length == 0) return new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE};

        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[] {min, max};
    }

}
