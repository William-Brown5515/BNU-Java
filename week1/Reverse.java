import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.print("Please enter an integer ");
        Integer num1 = numbers.nextInt();
        System.out.print("Please enter another integer ");
        Integer num2 = numbers.nextInt();
        System.out.println(num2);
        System.out.print(num1);
        numbers.close();
    }    
}
