import java.util.Scanner;

public class input_in {
 
     public static void main(String[] args) {
        System.out.println("hi i am shubham amran");
        Scanner take = new Scanner(System.in);
        // taking String as input
        String x= take.nextLine();
        System.out.println(x);

        // taking Integer as input
        int y= take.nextInt();
        System.out.println(y);    
    }

}
