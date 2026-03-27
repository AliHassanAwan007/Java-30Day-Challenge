import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class Day25 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element in list");
            list.add(sc.nextInt());
        }
        System.out.println("Actual list is"+list);

        ArrayList<Integer>reverselist=new ArrayList<>(5);
        for (int i = 4; i >=0; i--) {
            reverselist.add(list.get(i));
        }
        System.out.println("Revese of list is "+reverselist);

        list.remove(2);
        list.set(1,5);
        System.out.println("Final list is"+list);

        ArrayList<String>sortlist = new ArrayList<>();
        sortlist.add("Bannana");
        sortlist.add("Apple");
        sortlist.add("Mango");
        sortlist.sort(Comparator.naturalOrder());
        System.out.println("Accending order list is"+sortlist);
        sortlist.sort(Comparator.reverseOrder());
        System.out.println("deccending order list is"+sortlist);
    }
}
