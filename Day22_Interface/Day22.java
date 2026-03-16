import java.util.Scanner;

interface Animal{
    abstract void sound();
}
class Dogclass implements Animal{
     public void sound(){
        System.out.println("Sound of the dog is barking");
    }
}
interface people{
    abstract void work();
}
class Managerclass implements people{
    @Override
    public void work() {
        System.out.println("Mange all work");
    }
}
class Developerlass implements people{
    @Override
    public void work() {
        System.out.println("Develop the things");
    }
}
interface shap{
    abstract void area();
}
class Cirleclass implements shap{
    double radius;
    double area;
    @Override
    public void area() {
        area=3.14*radius*radius;
        System.out.println("Area of cirle is="+area);
    }
}

public class Day22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Dogclass d1=new Dogclass();
        d1.sound();
        Managerclass m1=new Managerclass();
        m1.work();
        Cirleclass c1=new Cirleclass();
        System.out.println("Enter radius");
        c1.radius= sc.nextInt();
        c1.area();
    }
}
