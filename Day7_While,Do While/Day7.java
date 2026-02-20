import java.util.Scanner;
public class Day7 {
    public static void main(String[] args){
        int i=1;
        while (i<=10){
            System.out.println("Number="+i);
            i++;
        }

    //Task 2

        int number=10;
        while (number>=1){
            System.out.println("Number="+number);
            number--;
        }

    //Task 3

        Scanner sc=new Scanner(System.in);
        int Total = 0;
        Boolean a=true;
        while(a==true){
            System.out.println("Enter the numbers");
            int usernumbers=sc.nextInt();
            if(usernumbers!=0){
                Total=Total+usernumbers;
            }
            else{
                a=false;
            }
        }
        System.out.println("Total sum is ="+Total);

    //Task 4
        boolean b=true;

            do {
                System.out.println("Enter the numbers");
                int negativenumber=sc.nextInt();
                if(negativenumber>0){
                    b=true;
                }
                else{
                    b=false;
                }

            }
            while (b==true);
            System.out.println("You enter negative number");
    }
}
