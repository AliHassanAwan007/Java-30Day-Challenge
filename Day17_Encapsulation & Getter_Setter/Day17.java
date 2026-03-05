import java.util.Scanner;
class Students{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    class Accounts{
        private String accountholdername;
        private int balance;

        public void setName(String name) {
            this.accountholdername = accountholdername;
        }

        void setBalance(int balance) {
            this.balance = balance;
        }

        void display(){
            System.out.println("Name= "+accountholdername);
            System.out.println("Age= "+balance);
        }
        void deposit(int newamount){
            int total=balance+newamount;
            System.out.println("Total Balance is= "+total);
            balance=total;
        }
        void withdraw(int newamount){
           if(newamount<=balance){
               int newtotal=balance-newamount;
               System.out.println("Total Balance is= "+newtotal);
           }
           else {
               System.out.println("Invalid amount for withdrawl");
           }
        }
    }

}
class User{
    private String username;
    private String password;
    String Name;
    String pass;
    void setcredential(String name,String password){
        this.username=name;
        this.password=password;
    }
    void checklogin(String Name,String pass){
        if(username.equals(Name) && password.equals(pass)){
            System.out.println("login");
        }
        else{
            System.out.println("invalid");
        }
    }
}

public class Day17 {
    public static void main(String[] args){
        Students s1=new Students();
        s1.setName("Ali");
        s1.setAge(23);
        System.out.println("Name of Student= "+s1.getName());
        System.out.println("Age of Student= "+s1.getAge());
        Students.Accounts s2=s1.new Accounts();
        s2.setName("Hassan");
        s2.setBalance(1000);
        s2.display();
        s2.deposit(500);
        s2.withdraw(1000);
        User s3=new User();
        s3.setcredential("Ali","Ali23");
        String Name;
        String pass;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username");
        Name= sc.next();
        System.out.println("Enter Password");
        pass=sc.next();
        s3.checklogin(Name,pass);


    }
}
