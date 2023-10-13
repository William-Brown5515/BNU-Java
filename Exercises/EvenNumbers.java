public class EvenNumbers {
    public static void main(String[] args) {
        Integer num1 = 0;
        while (num1 < 10) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
            }
            num1 = num1 + 1;
        }
    }
}