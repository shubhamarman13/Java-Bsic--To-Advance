
import java.util.Scanner;
public class if_else {

    public static void main(String[] args)
    {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age= take.nextInt();
        if (age>18) {
            System.out.println("Eliglible");
            
        }
        else
        {
            System.out.println("Not Eliglible");
        }
    }
}
