import java.util.Scanner;

public class FeetMiles {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.print("Please enter the amount of feet (measurement!)");
        Float feet = inputs.nextFloat();
        Float miles = (feet / 5280);
        System.out.print("The amount of miles is...     ");
        System.out.print(miles);
        inputs.close();
    }
}
