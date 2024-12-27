package ss6_string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Exercise2 {
    public static void main(String[] args) throws ParseException {
        String dateStr="02/08/2023";
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date date=sdf.parse(dateStr);
        System.out.println(date);

        // câu b:
        Date date1=new Date();// lấy ra ngày giơf hiện tại
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        String dateb=format.format(date1);
        System.out.println("ngày hiện tại: "+dateb);

        //câu c: chuyển chuỗi 02/08/2023 sang localDate

        String dateStrc="02/08/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        //DateTimeFormatter formatter=new DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate local=LocalDate.parse(dateStr,formatter);
        System.out.println(local);

        // câu d:
        LocalDate currDated= LocalDate.now();
        DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String dateStr1=formatter1.format(currDated);
        System.out.println("Localdate: "+dateStr1);

        //câu e: lấy ngày, tháng, năm, giờ, phút , giây hiện tại của hệ thống
        LocalDateTime currDated1= LocalDateTime.now();
        int day=currDated1.getDayOfMonth();
        int month=currDated1.getMonthValue();
        int year=currDated1.getYear();
        int hour=currDated1.getHour();
        int minute=currDated1.getMinute();
        int second=currDated1.getSecond();
        System.out.println("day: "+day);
        System.out.println("month: "+month);
        System.out.println("year: "+year);
        System.out.println("hour: "+hour);
        System.out.println("minute: "+minute);
        System.out.println("second: "+second);

        // câu f: tăng 1 tháng
        LocalDateTime currDated2=LocalDateTime.now();
        LocalDate monthLater= currDated2.toLocalDate().plusMonths(1);
        System.out.println("month later: "+monthLater);

        //câu g: tăng thêm 1000 ngày
        LocalDateTime currDated3=LocalDateTime.now();
        LocalDate dayg=currDated3.toLocalDate().plusDays(1000);
        System.out.println("1000 ngày: "+dayg);
    }
}
