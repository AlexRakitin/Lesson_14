import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lesson_14 {
    public static void main(String[] args) {
        System.out.println("***** Задание 1 *****" );
        System.out.println("Введите дату в формате: \"yyyy/MM/dd\"");
        Scanner scan = new Scanner(System.in);
        String inputDate = scan.nextLine();
        Date dateDay = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            dateDay = dateFormat.parse(inputDate);
        } catch (ParseException e) {
            dateDay = Lesson_Service.parseInputDate(scan);
        }
        System.out.println("Введённый день: " + new SimpleDateFormat("EEEE").format(dateDay));

        System.out.println("***** Задание 2 *****" );
    }

}

