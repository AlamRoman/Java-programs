public class bubble_sort{
    public static void main(String[] args){
        //declare the array
        int[] arr = new int [5];

        //initialize the array
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 5;
        arr[3] = 2;
        arr[4] = 6;

        //print the initial array
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //bubble sort algorithm
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        //print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}