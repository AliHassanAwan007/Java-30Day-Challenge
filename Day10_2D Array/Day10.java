import java.util.Scanner;
public class Day10 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][]arr= new int[3][3];
        //for input
        System.out.println("Enter the Numbers");
        for(int i=0;i<=2;i++){
            for(int j = 0; j <=2; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("matic is given below");
        //for output
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //Task2
        int total=0;
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j < arr.length; j++){
                total=total+arr[i][j];
            }
            System.out .println();
        }
        System.out .println("Sum of all element of array is="+total);

        //Task 3
        int rowsum=0;
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]+" ");
                rowsum=rowsum+arr[i][j];
            }
            System.out .println();
            System.out .println("Sum of Row="+rowsum);
            rowsum=0;
        }
        //Task 4
        int maximum=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j = 0; j < arr.length; j++){
                if (maximum<=arr[i][j]){
                maximum=arr[i][j];
                }
            }
            }
            System.out .println("Maximum="+maximum);
    }
}
