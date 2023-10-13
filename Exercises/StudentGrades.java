import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner grades = new Scanner (System.in);
        System.out.println("Please enter your letter grade");
        String letter = grades.nextLine();
        if (letter.equals("a")) {
            System.out.println("You got a 1st");
        }
        else if (letter.equals("b")) {
            System.out.println("You got a 2:1");      
        }
        else if (letter.equals("c")) {
            System.out.println("You got a 2:2");
        }
        else if (letter.equals("d")) {
            System.out.println ("You got a 3rd");
        }
        else if (letter.equals("e")) {
            System.out.println("You got an ordinary");
        }
        else {
            System.out.println("You got a fail");
        }
        grades.close();
    }
}