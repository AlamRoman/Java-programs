import java.util.Scanner;

public class function{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        
        //input of the variables
        int a, b;

        System.out.print("Enter the first number: ");
        a = scnr.nextInt();

        System.out.print("Enter the second number: ");
        b = scnr.nextInt();

        //calculate sum
        int sum = sum(a,b);
        System.out.println("\nThe sum of " + a + " and " + b + " is: " + sum);

        //if a is even or odd
        String str;

        if(is_even(a)){
            str = "even";
        }else{
            str = "odd";
        }

        System.out.println(a + " is " + str );

        //if b is even or odd
        if(is_even(b)){
            str = "even";
        }else{
            str = "odd";
        }

        System.out.println(b + " is " + str );

        scnr.close();
    }

    static boolean is_even(int n){
        if (n%2==0) {
            return true;
        }
        return false;
    }

    static int sum(int a, int b){
        return a+b;
    }
}