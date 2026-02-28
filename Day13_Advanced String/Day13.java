import java.util.Scanner;
public class Day13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String str= sc.next();
        String low=str.toLowerCase();
        String reverse="";
        System.out.println("String is "+str);


        for (int i=low.length()-1;i>=0;i--){
            reverse= reverse + low.charAt(i);
        }

        if (str.equals(reverse)){
            System.out.println("Penadrom");
        }
        else{
            System.out.println("Not Penadrom");
        }
        //Task 2
        String reversestr="";
        for(int i=str.length()-1;i>=0;i--){
            reversestr = reversestr+str.charAt(i);
        }
        System.out.println("Reverse of String is="+reversestr);

        //Task 3
        int countdegit=0;
        int countalphabet=0;
        int countspecialcharecter=0;
        int countspace=0;
        int space;
        char letter;
        for(int i=0;i<str.length();i++){
           letter=str.charAt(i);
           if(Character.isDigit(letter) ){
               countdegit=countdegit+1;
           }
            if(Character.isAlphabetic(letter)){
                countalphabet=countalphabet+1;
            }
            if (!Character.isLetterOrDigit(letter)){
                countspecialcharecter=countspecialcharecter+1;
            }
            if (letter==' '){
                countspace=countspace+1;
            }

        }
        System.out.println("Number of digit="+countdegit);
        System.out.println("Number of alphabet="+countalphabet);
        System.out.println("Number of specialcharecter="+countspecialcharecter);
        System.out.println("Number of space="+countspace);
    }
}
