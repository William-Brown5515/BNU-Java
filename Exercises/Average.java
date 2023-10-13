import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner ave = new Scanner(System.in);
        System.out.print("Please enter a number ");
        Float num1 = ave.nextFloat();
        System.out.print("Please enter another number ");
        Float num2 = ave.nextFloat();
        Float sum = num1 + num2;
        Float result = sum / 2;
        System.out.print("The average of the two numbers is " + result);
        ave.close();
    }
}