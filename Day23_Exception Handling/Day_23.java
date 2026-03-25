import java.util.Scanner;
public class Day_23 {
    public static void main(String[] args) {
        int number;

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        try {
            int divisor = 0;
            int result = number / divisor;
            System.out.println("Result is " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Number is not divided by 0");
        }
        finally {
            System.out.println("Actual number is "+number);
        }
        try {
                int[]arr={1,2,3,4,5};
                System.out.println("Array is"+arr[7]);
        }
        catch (Exception e) {
            System.out.println("Invalid Index ");
        }
        try {
            int test;
            System.out.println("Enter number");
            test= sc.nextInt();
            System.out.println("Number is"+test);
        }
        catch (Exception e) {
            System.out.println("Invalid input ");
        }

        try {
            if(number==5){
                System.out.println("Number is "+number);
            }
        }
        catch (Exception e) {
            if(number==10)
            System.out.println("Number is "+number);
        }
        finally {
            System.out.println("Number is neither 5 nor 10");
        }
    }
}
