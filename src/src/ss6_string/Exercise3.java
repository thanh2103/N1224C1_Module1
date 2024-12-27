package ss6_string;

public class Exercise3 {
    public static void main(String[] args) {
        //a
        byte bytea = 100;
        short shorta = bytea;
        int inta = shorta;
        long longa = inta;
        float floata = longa;
        double doublea = floata;
        //b
        double doubleb = 100;
        float floatb = (float) doubleb;
        long longb = (long) floatb;
        int intb = (int)longb;
        short shortb = (short)intb;
        byte byteb = (byte)shortb;
        //c
        double doublec = 1000000000;
        float floatc = (float) doublec;
        long longc = (long) floatc;
        int intc = (int)longc;
        short shortc = (short)intc;
        byte bytec = (byte)shortc;
    }
}
