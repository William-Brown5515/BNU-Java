import java.util.Scanner;

public class YearBorn {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.print("How old are you?   ");
        Integer age = year.nextInt();
        Integer year_born = (2024 - age);
        System.out.print("You were probably born in the year ");
        System.out.println(year_born);
        if (age > 17) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a child");
        }
        year.close();
    }
}
