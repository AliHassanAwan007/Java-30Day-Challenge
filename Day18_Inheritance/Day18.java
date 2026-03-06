import java.util.Scanner;
class animal{
    String name;
    void ate(String name){
        System.out.println(name+"Ate...");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("hao hao hao");
    }
}
class person{
    String name;
    int age;
}
class students extends person{
    int marks;
    void result(int marks){
        if(marks>=50){
            System.out.println("The Student with name "+name+"and age " +age+" is pass");
        }
        else {
            System.out.println("The Student with name " +name+ "and age " +age+ " is fail");
        }
    }
}
class employee{
     String name;
     int salarey;
}
class manager extends employee{
     int bonous;
     void display(){
         int total = bonous + salarey;
         System.out.println("The Student with name " +name+ "and their Salarey is  " +total);
     }
     }
class basicalculator{
    int number1;
    int number2;
    void add(int number1,int number2){
        int sum=number1+number2;
        System.out.println("Sum is " +sum);
    }
    void sub(int number1,int number2){
        int sub=number1-number2;
        System.out.println("Sub is " +sub);
    }
}
class advancedcalculator extends basicalculator{
    void mul(int number1,int number2){
        int mult=number1 * number2;
        System.out.println("Mul is " +mult);
    }
    void div(int number1,int number2){
        int divi=number1+number2;
        System.out.println("div is " +divi);
    }
}
public class Day18 {
    public static void main(String[] args){
        dog d1=new dog();
        d1.ate("dog");
        d1.bark();
        students s1=new students();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        s1.name= sc.next();
        System.out.println("Enter the age");
        s1.age= sc.nextInt();
        System.out.println("Enter the marks");
        s1.marks= sc.nextInt();
        s1.result(s1.marks);
        manager m1=new manager();
        System.out.println("Enter the name of employee");
        m1.name= sc.next();
        System.out.println("Enter the salarey of employee");
        m1.salarey= sc.nextInt();
        System.out.println("Enter the bonous of employee");
        m1.bonous= sc.nextInt();
        m1.display();
        advancedcalculator a1=new advancedcalculator();
        System.out.println("Enter the number");
        a1.number1=sc.nextInt();
        System.out.println("Enter the number");
        a1.number1= sc.nextInt();
        a1.add(a1.number1, a1.number2);
        a1.sub(a1.number1, a1.number2);
        a1.mul(a1.number1, a1.number2);
        a1.div(a1.number1, a1.number2);

    }
}
