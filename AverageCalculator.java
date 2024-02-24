import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for integers
        System.out.println("Enter three integers:");
        int intNum1 = scanner.nextInt();
        int intNum2 = scanner.nextInt();
        int intNum3 = scanner.nextInt();
        
        // Prompt user for floating-point numbers
        System.out.println("Enter three floating-point numbers:");
        float floatNum1 = scanner.nextFloat();
        float floatNum2 = scanner.nextFloat();
        float floatNum3 = scanner.nextFloat();
        
        // Calculate and print averages
        System.out.println("Average of integers: " + calculateAverage(intNum1, intNum2, intNum3));
        System.out.println("Average of floating-point numbers: " + calculateAverage(floatNum1, floatNum2, floatNum3));
        
        //scanner.close();
    }

    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static double calculateAverage(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}