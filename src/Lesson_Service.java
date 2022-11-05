import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lesson_Service {
    public static Date parseInputDate(Scanner scan) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date parseDate = null;
        do {
            System.out.println("Данные не распарсились, повторите ввод: ");
            String inputDate = scan.nextLine();
            try {
                parseDate = dateFormat.parse(inputDate);
            } catch (ParseException ignored) {

            }
        } while (parseDate == null);
        return parseDate;
    }
}
