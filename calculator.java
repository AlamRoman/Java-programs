import java.util.Scanner;

public class calculator{

    static int n1,n2;
    static float ris;
    static char op;
    public static void main(String[] args){
        input();
        calculate();
        print_result();
    }

    static void input(){
        Scanner scnr = new Scanner(System.in);

        //input of variables
        System.out.print("Enter the first number: ");
        n1 = scnr.nextInt();
        
        System.out.print("Enter the second number: ");
        n2 = scnr.nextInt();

        select_operation();

        scnr.close();
    }

    static void select_operation(){
        Scanner scnr = new Scanner(System.in);
        
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
                System.out.print("\nError, wrong input, press enter to continue... ");
                scnr.nextLine();
                scnr.nextLine();
            }

        } while (op != '+' && op != '-' && op != '*' && op != '/' );

        scnr.close();
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