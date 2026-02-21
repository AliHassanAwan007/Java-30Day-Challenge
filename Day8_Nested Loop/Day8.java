public class Day8 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    //Task 2

        for(int a=1;a<=5;a++){
            for(int b=5;b>=a;b--){
                System.out.print("*");
            }
            System.out.println();
        }

    //Task 3

        for(int c=1;c<=5;c++){
            for(int d=1;d<=c;d++){
                System.out.print(d + " ");
            }
            System.out.println();
        }

        //Task 3

        for(int e=1;e<=5;e++){
            for(int f=1;f<=5;f++){
                System.out.print( f*e +"  ") ;
            }
            System.out.println();
        }
    }
}
