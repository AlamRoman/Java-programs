import java.util.Scanner;

public class basic_input{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = scnr.nextInt();
        scnr.nextLine(); //consume the newline char

        System.out.println("The number you entered is: " + x );

        System.out.print("Enter a string: ");
        String str = scnr.next();
        System.out.println("You entered: " + str);

        scnr.close();
    }
}