import java.util.Scanner;

public class Day11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[][]tran=new int[3][3];
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println("Enter The Number");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of Matrix");
        for (int i = 0; i < tran.length; i++){
            for (int j = 0; j < tran.length; j++){
                tran[j][i]=arr[j][i];
                System.out.print(tran[j][i] + " ");
            }
            System.out.println();
        }

    //Task 2
        if (arr==tran){
            System.out.println("Symetric");
        }
        else {
            System.out.println(" Not Symetric");
        }
    //Task 3
        int largest=arr[0][0];
        int seconedlargest=largest;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i][j]>=largest){
                    seconedlargest=largest;
                    largest=arr[i][j];
                }
            }
        }
        System.out.println("The largest of Martic is="+largest+" and the seconed largest of the Matic is="+seconedlargest);
    //Task 4
        int countofeven=0;
        int countofodd=0;
        int countofpositive=0;
        int countofnegative=0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i][j]>=0 && arr[i][j]%2==0){
                    countofeven=countofeven+1;
                    countofpositive=countofpositive+1;
                } else if (arr[i][j]<0 && arr[i][j]%2==0) {
                    countofeven=countofeven+1;
                    countofnegative=countofnegative+1;
                }
                else if (arr[i][j]>=0 && arr[i][j]%2!=0) {
                    countofodd=countofodd+1;
                    countofpositive=countofpositive+1;
                }
                else if (arr[i][j]<0 && arr[i][j]%2!=0) {
                    countofodd=countofodd+1;
                    countofnegative=countofnegative+1;
                }
                else {
                    System.out.println("You did not enter integer");
                }
            }
        }
        System.out.println("Number of even in Matric="+countofeven);
        System.out.println("Number of odd in Matric="+countofodd);
        System.out.println("Number of positive in Matric="+countofpositive);
        System.out.println("Number of negative in Matric="+countofnegative);
    }
}