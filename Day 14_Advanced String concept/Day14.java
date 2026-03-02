import java.util.Scanner;
public class Day14 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        String newstr ="";
        System.out.println("String is="+str);
        for (int i=0;i<str.length();i++){
            if(newstr.contains(String.valueOf(str.charAt(i)))){
                newstr=newstr;
            }
            else{
                newstr=newstr+str.charAt(i);
            }
        }
        System.out.println("New String is="+newstr);
        //Task 2
        for (int i = 0; i < str.length(); i++) {

            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First non-repeated character is: " + str.charAt(i));
                break;
            }
        }
        //Task 3
        for (int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            int count=0;
            if (str.indexOf(ch) != i){
                continue;
            }
            for (int j=0;j<str.length();j++){
                if (ch==str.charAt(j)){
                    count++;
                }
            }
            System.out.println(ch + " → " + count);
        }
    }

}
