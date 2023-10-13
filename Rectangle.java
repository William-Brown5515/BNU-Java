import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner widthHeight = new Scanner(System.in);
        System.out.print("Please enter width of rectangle ");
        Integer width = widthHeight.nextInt();
        System.out.print("Please enter height of rectangle ");
        Integer height = widthHeight.nextInt();
        Integer area = width * height;
        Integer perimeter = 2 * (width + height);
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}
