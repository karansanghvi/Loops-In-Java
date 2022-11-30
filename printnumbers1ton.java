//WAP to print number from 1 to n using while loop in java
import java.util.Scanner;

public class printnumbers1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        sc.close();
        int counter = 1; 
        while(counter <= range) {
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
