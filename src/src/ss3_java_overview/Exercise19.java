package ss3_java_overview;

public class Exercise19 {
    public static void main(String[] args) {
        int n = 10;

        String binary = "";

        while (n > 0) {
            binary = n % 2 + binary;
            n = n / 2;
        }
        System.out.println(binary);
    }
}
