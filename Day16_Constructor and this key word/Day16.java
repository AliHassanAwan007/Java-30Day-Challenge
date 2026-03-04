class Stu{
    String name;
    int age;
    Stu(String name,int age){
        this.name=name;
        this.age=age;
    }
    Stu(String name){
        this.name=name;
        age=18;
    }
    void display(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
        }
class account{
    String accountholdername;
    int balance;
    account(String name,int balance){
        this.accountholdername=name;
        this.balance=balance;
    }
    void display(){
        System.out.println("Name = "+accountholdername);
        System.out.println("Balance= "+balance);
    }
    void deposit(int newamount){
        int Total=balance+newamount;
        System.out.println("Total Balance= "+Total);
        balance=Total;
    }
    void withdraw(int newamount){
        if (newamount<=balance){
            int Total=balance-newamount;
            System.out.println("Total Balance= "+Total);
        }
        else {
            System.out.println("Invalid amount for withdraw ");
        }

    }
}
public class Day16 {
    public static void main(String[] args){
        Stu s1=new Stu("Ali");
        s1.display();
        account s2=new account("Hassan",1000);
        s2.display();
        s2.deposit(100);
        s2.withdraw(1000);
    }
}
