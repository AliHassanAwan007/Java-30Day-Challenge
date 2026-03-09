import java.util.Scanner;
class Animalsound{
    void sound(){
        System.out.println("Sound of the animal");
    }
}
class Dogsound extends Animalsound{
    @Override
    void sound() {
        System.out.println("Sound of the animal Dog is Hao Hao Hao");
    }
}

class Shape{
    void area(){
        System.out.println("Area of shape");
    }
}
class Circle extends Shape{
    int radius;
    double area;
    double pie= 3.14;
    @Override
    void area() {
        area= pie * radius * radius;
        System.out.println("Area of circle ="+area);
    }
}
class Rectangle extends Shape{
    int length;
    int width;
    int area;
    @Override
    void area() {
        area= length*width;
        System.out.println("Area of rectangle ="+area);
    }
}

class Employee{
    void work(){
        System.out.println("work of employee");
    }
}
class Manager extends Employee{
    @Override
    void work() {
        System.out.println(" work of manager");
    }
}
class Developer extends Employee{
    @Override
    void work() {
        System.out.println(" work of developer");
    }
}

class Payment{
    void pay(){
        System.out.println("way of payment");
    }
}
class Creditcard extends Payment{
    @Override
    void pay() {
        System.out.println(" Payment Through credit card");
    }
}
class Cash extends Payment{
    @Override
    void pay() {
        System.out.println(" Payment Through cash");
    }
}

public class Day20 {
    public static void main(String[] args){
    Animalsound a1=new Dogsound();
    a1.sound();
    System.out.println("Area calculation of circle");
    System.out.println("Enter radius");
    Scanner sc=new Scanner(System.in);
    Circle c1=new Circle();
    c1.radius= sc.nextInt();
    c1.area();
    System.out.println("Area calculation of rectangle");
    System.out.println("Enter length");
    Rectangle r1=new Rectangle();
    r1.length= sc.nextInt();
    System.out.println("Enter width");
    r1.width= sc.nextInt();
    r1.area();
    Employee m1=new Manager();
    m1.work();
    Employee d1=new Developer();
    d1.work();
    Payment p1=new Creditcard();
    p1.pay();
    Payment p2=new Cash();
    p2.pay();
    }
}
