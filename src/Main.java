import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Практическая работа №11. Задания 2, 4.
        Scanner sc = new Scanner(System.in);

        Calendar cal = Calendar.getInstance();
        System.out.println("Введите дату: Год Месяц Число");
        cal.set(Calendar.YEAR, sc.nextInt());
        cal.set(Calendar.MONTH, sc.nextInt());
        cal.set(Calendar.DAY_OF_MONTH, sc.nextInt());
        sc.nextLine();
        System.out.println("Введите время: Часы Минуты");
        cal.set(Calendar.HOUR, sc.nextInt());
        cal.set(Calendar.MINUTE, sc.nextInt());

        /*System.out.println("Введённая дата " +
                new SimpleDateFormat("yyyy-MM-dd hh:mm").format(cal.getTime()));*/

        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));


    }
}