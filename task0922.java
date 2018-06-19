import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sDate = reader.readLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        try {
            dateFormat.applyPattern("yyyy-MM-dd");
            Date date = dateFormat.parse(sDate);
            dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
            System.out.println(dateFormat.format(date).toUpperCase());
        } catch (Exception e) {
            System.out.println("Incorrect input");
        }
    }
}

//    Какое сегодня число?
//        Ввести с клавиатуры дату в формате "2013-08-18"
//        Вывести на экран введенную дату в виде "AUG 18, 2013".
//        Воспользоваться объектом Date и SimpleDateFormat.
