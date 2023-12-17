
import java.util.Scanner;
public class uzdevumi {
    public static void main(String[] args) throws Exception {
        // uzd 1
        // Write a program that asks the user for three integers and prints their average.

        Scanner myObjcom = new Scanner(System.in);  // Create a Scanner object
        int a = myObjcom.nextInt(); // lasam ievaditu
        int b = myObjcom.nextInt(); // lasam ievaditu
        int c = myObjcom.nextInt(); // lasam ievaditu
        System.out.println("Average of three numbers " + (a+b+c)/3);

    }
}