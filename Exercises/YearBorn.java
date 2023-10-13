import java.util.Scanner;

public class YearBorn {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.print("How old are you?   ");
        Integer age = year.nextInt();
        Integer year_born = (2023 - age);
        System.out.print("You were born in the year ");
        System.out.print(year_born);
        year.close();
    }
}