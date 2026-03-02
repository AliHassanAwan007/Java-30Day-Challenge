class student{
    String name;
    int age;
    void display(String abc ,int xyz){
        System.out.println("Name of Student is "+abc);
        System.out.println("Age of Student is "+xyz);
    }
}

class calcuator{
    int number1;
    int number2;
    int Sum(int a,int b){
        int sum=a+b;
        System.out.println("Sum is="+sum);
        return sum;
    }
    int Subtraction(int a,int b){
        int sub=a-b;
        System.out.println("Subtraction is="+sub);
        return sub;
    }
    int Multiply(int a,int b){
        int mul=a*b;
        System.out.println("Multiplication is="+mul);
        return mul;
    }
}

class Bankbalance{
    String accountholdername;
    int amount;
    void display(int amount){
        System.out.println("Account holder name is="+accountholdername);
        System.out.println("Total amount is="+amount);
    }
    void deposit(int newamount){
        int totalamount=amount+ newamount;
        System.out.println("Total amount is="+totalamount);
        amount=totalamount;
    }
    void withdraw(int newamount){
        if(newamount<=amount){
            int totalamount=amount-newamount;
            System.out.println("Total amount is="+totalamount);
        }
    }
}

public class Day15 {
    public static void main(String[] args){
        student s1=new student();
        s1.name="Ali";
        s1.age=22;
        System.out.println("Information about student is given below");
        s1.display(s1.name, s1.age);

        calcuator s2=new calcuator();
        s2.number1=5;
        s2.number2=3;
        s2.Sum(s2.number1,s2.number2);
        s2.Subtraction(s2.number1,s2.number2);
        s2.Multiply(s2.number1,s2.number2);

        Bankbalance s3=new Bankbalance();
        s3.accountholdername="Ali";
        s3.amount=1000;
        s3.display(s3.amount);
        s3.deposit(100);
        s3.withdraw(900);
    }
}

