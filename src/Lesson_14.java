import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Lesson_14 {
    private static final Integer TUESDAY = 3;

    public static void main(String[] args) {
        System.out.println("***** Задание 1 *****");
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
        scan.close();
        System.out.println("***** Задание 2 *****");

        Calendar calendar = Calendar.getInstance();
        int dayOfTheWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int dayData = TUESDAY-dayOfTheWeek;
        if (dayData <= 7) {
            dayOfTheWeek+=dayData;
        }
        calendar.add(Calendar.DAY_OF_WEEK, dayData);
        System.out.println("Следующий вторник: " + dateFormat.format(calendar.getTime()));





//        int dayTuesday = calendar.get(Calendar.TUESDAY)+1;
//        System.out.println(dayTuesday);

    }

}

