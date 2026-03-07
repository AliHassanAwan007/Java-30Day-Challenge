import javax.xml.namespace.QName;
import java.util.Scanner;
class Animals{
    void sound(){
        System.out.println("Sound of Animal...");
    }
}
class Dogs extends Animals{
    @Override
    void sound() {
        System.out.println("Sound of Dog is Hao Hao Hao...");
    }
}

class Vehicle{
    void start(){
        System.out.println("Sound of Vehicle start...");
    }
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Sound of Car is Hun Hun Hun...");
    }
}


class Persons{
     String name;

    void display(){
        System.out.println("Name of person is="+name);
    }
}
class Employes extends Persons{

    int salarey;
    @Override
    void display() {
        System.out.println("Name of person is= "+name +" and the salrey is= "+salarey);
    }
}

class Calculators{
    int a;
    int b;
    void calculate(int x,int y){
        int addition=x+y;
        System.out.println("Addition is= "+addition);
    }
}
class AdvancedCalculators extends Calculators{
    @Override
    void calculate(int x,int y) {
        int multiply= x * y;
        System.out.println("Multiply is= "+multiply);
    }
}

class Bank{
    int updatedbalance;
    int balance;
    int newamount;
    void withdraw(int x,int y){
        if(y<=x)
            updatedbalance= balance-newamount;
        System.out.println("Balance is= "+updatedbalance);
    }
}
class Newclass extends Bank{
    @Override
    void withdraw(int x,int y) {
        if(y>=x)
            updatedbalance= newamount-balance;
        System.out.println("Balance is= "+updatedbalance);
    }
    }

public class Day19 {
    public static void main(String[] args){
        Dogs d1=new Dogs();
        d1.sound();
        Car c1=new Car();
        c1.start();
        Scanner sc=new Scanner(System.in);
        Employes e1=new Employes();
        System.out.println("Enter name of employ ");
        e1.name= sc.next();
        System.out.println("Enter salarey of employ ");
        e1.salarey=sc.nextInt();
        e1.display();
        AdvancedCalculators a1=new AdvancedCalculators();
        System.out.println("Enter number");
        a1.a= sc.nextInt();
        System.out.println("Enter number");
        a1.b= sc.nextInt();
        a1.calculate(a1.a, a1.b);
        Newclass n1=new Newclass();
        System.out.println("Enter Balance");
        n1.balance= sc.nextInt();
        System.out.println("Enter Amount of withdraw");
        n1.newamount= sc.nextInt();
        n1.withdraw(n1.balance, n1.newamount);
    }
}
