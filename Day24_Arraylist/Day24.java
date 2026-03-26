import java.util.ArrayList;
import java.util.Scanner;
public class Day24 {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>(5);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println("Add number");
            list.add(sc.nextInt() );
        }
        System.out.println("List is "+list);
        System.out.println("List size is "+list.size());

        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum=sum+list.get(i);
        }
        System.out.println("List sum is "+sum);


        ArrayList<String>list1=new ArrayList<>();
        for (int j= 0; j < 5; j++) {
            System.out.println("Add Name");
            list1.add(sc.next());
        }
        System.out.println("List is "+list1);
        ArrayList<String>list2=new ArrayList<>();
        for (int k= 0; k< 5; k++) {
            if(list1.get(k).length()>=4){
               list2.add(list1.get(k)) ;
            }
        }
        System.out.println("List is "+list2);

        String name="Ali";
        for (int l= 0; l< 5; l++) {
            if (list1.get(l).equals(name)) {
                System.out.println("Name " + name + " is exsist");
            }
        }

        int maximum=list.get(0);
        int minimum=list.get(0);
        for(int i=0;i<5;i++)
        {
            if (list.get(i)>=maximum){
                maximum= list.get(i);
            }
            if (list.get(i)<=minimum){
                minimum= list.get(i);
            }
        }
        System.out.println("List Maximum is "+maximum);
        System.out.println("List Minimum is "+minimum);
    }

}
