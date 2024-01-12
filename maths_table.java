import java.util.*;
public class maths_table {
    public static void main(String[] args) {
        System.out.println("Enter the Number to print the table \n");
        Scanner take = new Scanner(System.in);
        int num = take.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " X " + num * i);
        }
    }

}
