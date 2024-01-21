import java.util.Arrays;

/*Написать метод, принимающий на вход размеры двумерного массива и выводящий массив в
виде инкременированной цепочки чисел, идущих по спирали.*/
public class SpiralMatrix {
    public static void main(String[] args) {
        int column = 6;
        int row = 4;
        int [][] matrix = spiralMatrix(column,row);
        printMatrix(matrix);
    }

   public static int[][] spiralMatrix(int column, int row) {
       int[][] matrix = new int[column][row];
       int i = 0;
       int j = 0;
       int number = 2;
       int maxNumber = column * row;
       matrix[i][j] = 1;

       while (number <= maxNumber) {
            boolean canmove;
            if (j + 1  < matrix[0].length) {
                if (matrix[i][j + 1] == 0){
                    canmove = true;
                    while (canmove) {
                        canmove = false;
                        if (matrix[i][j+1] == 0) {
                            j = j + 1;
                            matrix[i][j] = number;
                            number++;
                        }
                        if (j + 1  < matrix[0].length) {
                            if (matrix[i][j+1]==0) {
                                canmove = true;
                            }
                        }
                    }
                }
            }

            if (i + 1 < matrix.length) {
                if (matrix[i + 1] [j] == 0) {
                    canmove = true;
                    while (canmove) {
                        canmove = false;
                        if (matrix[i + 1][j] == 0) {
                            i = i + 1;
                            matrix[i][j] = number;
                            number++;
                        }
                        if (i + 1  < matrix.length) {
                            if (matrix[i+1][j]==0){
                                canmove = true;
                            }
                        }
                    }
                }
            }

            if (j - 1 >= 0) {
                if (matrix[i] [j - 1] == 0) {
                    canmove = true;
                    while (canmove){
                        canmove = false;
                        if (matrix[i] [j-1] == 0){
                            j = j - 1;
                            matrix[i][j] = number;
                            number++;
                        }
                        if (j - 1  >= 0){
                            if (matrix[i] [j - 1]==0) {
                                canmove = true;
                            }
                        }
                    }
                }
            }

            if (i - 1 >= 0) {
                if (matrix[i - 1][j] == 0) {
                    canmove = true;
                    while (canmove) {
                        canmove = false;
                        if (matrix[i-1][j] == 0){
                            i = i - 1;
                            matrix[i][j] = number;
                            number++;
                        }
                        if (i - 1  >= 0){
                            if (matrix[i-1][j]==0){
                                canmove = true;
                            }
                        }
                    }
                }
            }
            }
       return  matrix;
    }
    public static void printMatrix(int[][] matrix){
        for (int k = 0; k < matrix.length ; k++) {
            for (int l = 0; l < matrix[0].length; l++) {
                System.out.print("  " + matrix[k][l] + "  ");
            }
            System.out.println(" ");
        }
    }
}
