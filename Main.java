import java.util.Scanner;


public class Main {
    public static void main(String[] args) {    
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.print("Please enter your name");
        String name = myObj.nextLine();
        System.out.print("Hello ");
        System.out.print(name);
    }
}
