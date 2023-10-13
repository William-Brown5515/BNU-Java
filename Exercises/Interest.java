import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner bank = new Scanner(System.in);
        System.out.print("How much money is in your account? ");
        Float money = bank.nextFloat();
        Double interest = 1.01;
        Double total = (money * interest);
        System.out.print("The amount of money after a year is....");
        System.out.print(total);
        bank.close();
    }
}
