import java.util.Scanner;
abstract class AnimalsClass{
    abstract void makesound();
}
class Dogs extends AnimalsClass{
    void makesound(){
        System.out.println("Barking");
    }
}

abstract class ShapClass{
    abstract void area();
}
class CircleClass extends ShapClass{
    double radius;
    private double total;
    void area(){
        total=3.14*radius*radius;
        System.out.println("Area is="+this.total);
    }
}
class RectangleClass extends ShapClass{
    int length;
    int weidth;

    void area(){
        int total= length * weidth;
        System.out.println("Area is="+total);
    }
}


 abstract class EmployeeClass{
    abstract void work();
}
class ManagerClass extends EmployeeClass{
    @Override
    void work() {
        System.out.println(" work of manager");
    }
}
class DeveloperClass extends EmployeeClass{
    @Override
    void work() {
        System.out.println(" work of developer");
    }
}

abstract class PaymentClass{
    abstract void pay();
}
class CreditcardClass extends PaymentClass{
    @Override
    void pay() {
        System.out.println(" Payment Through credit card");
    }
}
class CashClass extends PaymentClass{
    @Override
    void pay() {
        System.out.println(" Payment Through cash");
    }
}
public class Day21 {
    public static void main(String[] args){
        Dogs d1=new Dogs();
        d1.makesound();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        CircleClass c1=new CircleClass();
        c1.radius= sc.nextInt();
        c1.area();
        System.out.println("Enter length");
        RectangleClass r1=new RectangleClass();
        r1.length= sc.nextInt();
        System.out.println("Enter width");
        RectangleClass r2=new RectangleClass();
        r2.weidth= sc.nextInt();
        r2.area();
        ManagerClass m1=new ManagerClass();
        m1.work();
        DeveloperClass d2=new DeveloperClass();
        d2.work();
        CreditcardClass c2=new CreditcardClass();
        c2.pay();
        PaymentClass p2 =new CashClass();
        p2.pay();
    }
}
