import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        Boolean carry_on = true;
        do {
            System.out.print("Pick a number...     ");
            Integer num1 = number.nextInt();
            for (int i = 1; i <= 12; i = i + 1) {
                System.out.print(i);
                System.out.print(" x ");
                System.out.print(num1);
                System.out.print(" = ");
                System.out.println(i * num1);
            }
            System.out.print("Would you like to do it again?    ");
            carry_on = number.nextBoolean();
        }
        while (carry_on = true);
        System.out.println(carry_on);
        number.close();
    }
}