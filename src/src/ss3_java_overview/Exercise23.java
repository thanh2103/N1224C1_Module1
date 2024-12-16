package ss3_java_overview;

public class Exercise23 {
    public static void main(String[] args) {
        for (int i = 10; i < 99; i++) {
            int a = i / 10;
            int b = i % 10;

            int sum = a + b;
            int tich = a * b;

            if (tich == 2 * sum) {
                System.out.println(i);
            }
        }
    }
}
