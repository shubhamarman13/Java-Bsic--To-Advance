import java.util.Scanner;

public class simple_calculator_ {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input="";
        int num1=0,num2=0 ,choice=0;
        while (!input.equals("no")) 
        {

            System.out.println("**********************************************");
            System.out.println("1 Addition");
            System.out.println("2 Substraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Divison \n");
            
            System.out.println("**********************************************");
            System.out.println("\nEnter Your Choise");
            choice= sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter the First number ");
                    num1=sc.nextInt();
                    System.out.println("Enter the second  number ");
                    num2=sc.nextInt();
                    System.out.println("Result = "+ num1+num2);
                    
                    break;
                case 2:
                    System.out.println("Enter the First number ");
                    num1=sc.nextInt();
                    System.out.println("Enter the second  number ");
                    num2=sc.nextInt();
                    System.out.println("Result = "+ (num1-num2));
                    break;
                case 3:
                    System.out.println("Enter the First number ");
                    num1=sc.nextInt();
                    System.out.println("Enter the second  number ");
                    num2=sc.nextInt();
                    System.out.println("Result = "+  num1*num2);
                    break;
                case 4:
                    System.out.println("Enter the First number ");
                    num1=sc.nextInt();
                    System.out.println("Enter the second  number ");
                    num2=sc.nextInt();
                   if (num2==0) {
                    System.out.println("Sorry We can not divide a number by Zero ");
                    break;
                    
                   }
                   else
                   {
                    System.out.println("Result = "+  num1/num2);
                   }
                    break;
            
                default:
                System.out.println("wrong input");
                    break;
            }

            sc.nextLine();
            System.out.println("Type Yes to contionue No to exit ");
            input= sc.nextLine().toLowerCase();    
        }
        System.out.println("Thank you ");
    }
}
