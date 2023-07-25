public class command_line_arguments{
    public static void main(String[] args){
        //check if there are any arguments
        if(args.length==0){
            System.out.println("There are no arguments");
        }else{
            //print all the arguments
            for(int i=0; i<args.length; i++){
                System.out.println(args[i]);
            }
        }
    }
}