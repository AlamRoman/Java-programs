import java.util.Scanner;

public class calculator{

    static Scanner scnr = new Scanner(System.in);

    static int n1,n2;
    static float ris;
    static char op;
    public static void main(String[] args){

        char c;

        do {
            input();
            calculate();
            print_result();

            do {
                System.out.print("Do you want to use the calculator again?(y/n): ");
                c = scnr.next().charAt(0);

                if(c != 'y' && c != 'Y' && c != 'n' && c != 'N' ){
                    wrong_input_error();
                }

                clear_screen();
            } while (c != 'y' && c != 'Y' && c != 'n' && c != 'N');

        } while (c == 'y' || c == 'Y' );

        scnr.close();
    }

    static void input(){

        //input of variables
        System.out.print("Enter the first number: ");
        n1 = scnr.nextInt();
        
        System.out.print("Enter the second number: ");
        n2 = scnr.nextInt();

        select_operation();

    }

    static void select_operation(){
        
        do {
            clear_screen();

            System.out.println("\nSelect an operation:");
            System.out.println("\t1. addition ( + )");
            System.out.println("\t2. substraction ( - )");
            System.out.println("\t3. multiplication ( * )");
            System.out.println("\t4. division ( / )");
            System.out.print("Enter the operation: ");

            op = scnr.next().charAt(0);

            if(op != '+' && op != '-' && op != '*' && op != '/'){
                wrong_input_error();
            }

        } while (op != '+' && op != '-' && op != '*' && op != '/' );

    }

    static void wrong_input_error(){
        System.out.print("\nError, wrong input, press enter to continue... ");
        scnr.nextLine();
        scnr.nextLine();

    }

    static void clear_screen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    static int addInt(int a, int b){
        return a+b;
    }

    static int subInt(int a, int b){
        return a-b;
    }

    static int mulInt(int a, int b){
        return a*b;
    }

    static float divInt(int a, int b){
        return (float)a/b;
    }

    static void calculate(){
        switch (op) {
            case '+':
                ris=addInt(n1, n2);
                break;

            case '-':
                ris=subInt(n1, n2);
                break;

            case '*':
                ris=mulInt(n1, n2);
                break;

            case '/':
                ris=divInt(n1, n2);
                break;
        }
    }

    static void print_result(){
        clear_screen();

        System.out.println("Result:\n");
        System.out.println(n1 + " " + op + " " + n2 + " = " + ris );
        System.out.println();
    }
}