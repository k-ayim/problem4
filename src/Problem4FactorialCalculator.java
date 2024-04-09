import java.util.Scanner;

public class Problem4FactorialCalculator {
    
    /**
     * Calculates the factorial of a number using recursion.
     * 
     * @param n The number to find the factorial of
     * @return The factorial of the number
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = factorial(number);
        System.out.println(number + "! = " + result);
        
        scanner.close();
    }
}

