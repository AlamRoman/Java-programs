public class average_of_2d_array{
    public static void main(String[] args){
        //dichiaro i variabili
        int row=2,col=3;
        int sum=0;
        float average;
        int matrix[][] = new int[row][col];

        //inizializzo la matrice
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j]=3;
            }
        }

        matrix[0][0]=10;

        //calcolo la somma dei valori
        for(int i=0;i<row;i++){
            for (int j = 0; j < col; j++) {
                sum+=matrix[i][j];
            }
        }

        //calcolo la media
        average = (float) sum / (row*col);

        //stampo la media
        System.out.println("La media e': " + average);
    }
}