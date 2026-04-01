
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Day26 {
    public static void main(String[] args){

        HashMap <Integer,String> name=new HashMap<>(5);
        System.out.println("Enter age and name");
        int Age;
        String namee;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Enter age");
            Age= sc.nextInt();
            System.out.println("Enter name");
            namee= sc.next();
            name.put(Age,namee);
        }
        System.out.println("hashmap is "+name);
            if (name.containsKey(21)){
                System.out.println("key 21 is present in hash map and name is"+name.get(21));
            }


        HashMap<Integer,String> student=new HashMap<>(5);
        int marks;
        String studentname;
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter marks");
            marks= sc.nextInt();
            System.out.println("Enter student name");
            studentname= sc.next();
            student.put(marks,studentname);
        }

        System.out.println("hashmap is "+student);
        HashMap<Integer,String> product=new HashMap<>(5);
        int price;
        String productname;
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter price");
            price= sc.nextInt();
            System.out.println("Enter product name");
            productname= sc.next();
            product.put(price,productname);
        }
        System.out.println("hashmap is "+product);
        int lowPrice = Collections.min(product.keySet());
        int highPrice = Collections.max(product.keySet());
        System.out.println("Lowest price product: " + product.get(lowPrice) + " at " + lowPrice);
        System.out.println("Highest price product: " + product.get(highPrice) + " at " + highPrice);

        sc.close();
    }
}




