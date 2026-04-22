import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int result = 100 / num;

            int[] arr = {1, 2, 3};
            System.out.println("Element: " + arr[5]);

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of range!");
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        } finally {
            System.out.println("Program executed.");
            sc.close();
        }
    }
}