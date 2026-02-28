import java.util.Scanner;
public class Day12 {
    public static void main(String[] args){
        System.out.println("Enter the String");
        Scanner sc= new Scanner(System.in);
        String word;
        word=sc.next();
        System.out.println("The length of String is="+word.length());

        //Task 2
        System.out.println("All letter of String is Converted to Uper case="+word.toUpperCase());
        //Task 3
        char first=word.charAt(0);
        char last=word.charAt(word.length()-1);
        if(first== '@' || first== '!' || first== '#' ){
            System.out.println("String Start with Special charecter");
        }

        if(last== '@' || last== '!' || last== '#'){
            System.out.println("String end with Special charecter");
        }

        //Task 4
        int countofvowels=0;
        int countofconsonent=0;
        String lword=word.toLowerCase();
        for(int i=0;i<lword.length();i++){
           char letter=lword.charAt(i);
           if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
               countofvowels=countofvowels+1;
           }
           else{
               countofconsonent=countofconsonent+1;
           }
            System.out.println("Number of vowels in a string"+countofvowels+"Number of consonenr in a string"+countofconsonent);
        }

    }}

