public class Day4 {
    public static void main(String[] args){
        int marks=75;
        if(marks>=50 && marks<=100){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }


//Task 2

        int age=30;
        if(age>=18){
            if(age>=60){
                System.out.println("Senior Citizen");
            }
            else{
                System.out.println("Adult");
            }
        }
        else{
            System.out.println("Minor");
        }

//Task 3


        String username="admin";
        String password="@1234";
        if(username.equals("admin") && password.equals("@1234"))
        {
            System.out.println("Login Successfully");
        }
        else{
            System.out.println("Incorect username or password");

        }

    }
}
