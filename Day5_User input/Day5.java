import java.util.Scanner;
public class Day5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

//Task 2

        double number1=sc.nextDouble();
        int number2=sc.nextInt();
        double addition=number1+number2;
        double subtraction=number1-number2;
        double multiplication=number1*number2;
        double division=number1/number2;
        System.out.println("Addtion of tow number is="+ addition);
        System.out.println("Subtraction of tow number is="+ subtraction);
        System.out.println("Multiplication of tow number is="+ multiplication);
        System.out.println("Division of tow number is="+ division);

//Task 3

        int marks=sc.nextInt();
        if(marks>=80){
            System.out.println("A Grade");
        } else if (marks>=60) {
            System.out.println("B Grade");
        } else if (marks>=40) {
            System.out.println("C Grade");
        }
        else {
            System.out.println("Fail");
        }

    }




}
