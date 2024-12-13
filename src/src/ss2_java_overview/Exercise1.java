package ss2_java_overview;

public class Exercise1 {
    public static void main(String[] args) {

        boolean a = true && false;//false
        boolean b = (3 > 100) || (25 % 5 == 0);//true
        boolean c = a && b;//false
        boolean d = !a || b;//true

        System.out.println("Biến c: " + c);
        System.out.println("Biến d: " + d);
    }
}
