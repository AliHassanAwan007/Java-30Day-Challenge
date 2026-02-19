import java.util.Scanner;

public class Day6 {
    public static void main(String[] args){

        for(int i=1;i<=10;i++){
            System.out.println("Number="+i);
        }
//Task 2
       for(int i=1; i<=20;i++){
           if(i%2==0){
               System.out.println("Even Number="+i);
           }

       }
//Task 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("Table of Number="+number);
        for(int i=1;i<=10;i++){
            System.out.println(number+"*"+i+"="+number*i);
        }
//Task 4
        System.out.println("Enter Number");
        int num= sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Sum of numbers from 1 to n "+sum);


    }
}
