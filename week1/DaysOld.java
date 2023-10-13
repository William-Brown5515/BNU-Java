import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DaysOld {
    public static void main(String[] args) {
        Scanner dob = new Scanner(System.in);
        System.out.print("Please enter the day of your date of birth   ");
        Integer birthDay = dob.nextInt();
        System.out.print("Please enter the month of your date of birth   ");
        Integer birthMonth = dob.nextInt();
        System.out.print("Please enter the year of your date of birth   ");
        Integer birthYear = dob.nextInt();

        Calendar now = Calendar.getInstance();
        Integer year = now.get(Calendar.YEAR);
        Integer month = now.get(Calendar.MONTH);
        Integer day = now.get(Calendar.DATE);

        LocalDate dateBefore = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate dateAfter = LocalDate.of(year, month, day);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        System.out.println(noOfDaysBetween);
        dob.close();
    }
}
