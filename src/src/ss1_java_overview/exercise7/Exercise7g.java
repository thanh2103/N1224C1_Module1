package ss1_java_overview.exercise7;

public class Exercise7g {
    public static void main(String[] args) {
        int i = 1;
        int a = i++ + ++i + i-- - --i;//1+3+3-1
        System.out.println("i= " + i);
        System.out.println("a= " + a);
    }
}
