package ss5_java_dubug_string;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        //a. String->int
        String str1="12345";
        int a=Integer.parseInt(str1);

        //b. int ->String
        String str2=String.valueOf(a);

        //c. String ->long
        long c=Long.parseLong(str2);

        //d. long ->string
        String str3=String.valueOf(c);

        //e. string -> float
        float e=Float.parseFloat(str3);

        //f. float-> string
        String str4=String.valueOf(e);

        //

    }
}
