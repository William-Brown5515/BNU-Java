import java.util.Scanner;

public class UniGrade {
    public static void main(String[] args) {
        Scanner grades = new Scanner (System.in);
        System.out.print("Enter the percentage of the marks");
        Integer mark = grades.nextInt();
        if (mark < 40) { 
            System.out.print("You failed");
        }
        else if (mark < 50) {
            System.out.print("You achieved a third");
        }
        else if (mark < 60) {
            System.out.print("You achieved a 2:2");
        }
        else if (mark < 70) {
            System.out.print("You achieved a 2:1");
        }
        else {
            System.out.print("You achieved a first");
        }
        grades.close();
    }
}