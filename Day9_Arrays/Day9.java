import java.util.Scanner;
public class Day9 {
    public static void main(String[] args){
        int[]a= {1,2,3,4,5};
        System.out.println("Numbers in array are");
        for (int i=0;i<=4;i++){

            System.out.println(a[i]);
        }
    //Task 2
        int[]arr=new int[5];
        int total=0;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<=4;i++){
            System.out.println("Enter the number");
            arr[i]=sc.nextInt();
            total=total+arr[i];

        }
        System.out.println("Total sum of array is="+total);
    //Task 3
        int[]newarr=new int[5];
        int maximum=newarr[0];
        int minimum=newarr[0];
        for (int i=0;i<=4;i++){
            System.out.println("Enter the number");
            newarr[i]=sc.nextInt();
            if (newarr[i]>=maximum){
                maximum=newarr[i];
            }
            if (newarr[i]<=minimum){
                minimum=newarr[i];
            }
        }
        System.out.println("Maximum of array is="+maximum+" and Minimum of array is="+minimum);


    //Task 4
        int[]array=new int[5];
        int count_of_even=0;
        int count_of_odd=0;
        for (int i=0;i<=4;i++){
            System.out.println("Enter the number");
            array[i]=sc.nextInt();
            if (array[i]%2==0){
                count_of_even=count_of_even+1;
            }
            else{
                count_of_odd=count_of_odd+1;
            }
        }
        System.out.println("Numbers that are even in array are="+count_of_even+" Numbers that are odd in array are="+count_of_odd);




    }
}
