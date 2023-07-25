public class string{
    public static void main(String[] args){
        String str = "Hello, how are you?";

        //print string
        System.out.println(str + "\n");

        //to upper case
        String str_upr = str.toUpperCase();

        System.out.println("Uppercase: " + str_upr + "\n" );

        //to lowercase
        String str_lwr = str.toLowerCase();

        System.out.println("Lowercase: " + str_lwr + "\n" );
        
        //split string
        String [] str_array = str.split("\\s+");

        System.out.println("Slitted string: ");

        for(int i=0; i<str_array.length; i++){
            System.out.println(str_array[i]);
        }

        //char at
        int index=7;
        char c;

        c = str.charAt(index);

        System.out.println("\n" + "Char at index " + index +  "is equal to: " + c );
    }
}