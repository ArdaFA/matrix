package matrix;

public class Matrix {
    public static int[][] transpose(int[][] A){
        int[][] newMatrix = new int[A[0].length][A.length];
        for (int i = 0; i < A[0].length; i++){
            for (int j = 0; j < A.length; j++){
                newMatrix[i][j] = A[j][i];
            }
        }
        return newMatrix;
    }

    public static int[][] add(int[][] A, int[][] B){
        if((A.length != B.length) || (B[0].length != A[0].length)){
            System.out.println("matrix dimensions do not match each other!");
            int[][] empty = new int[0][0];
            return empty;
        }
        else {
            // create newMatrix
            int[][] newMatrix = new int[A.length][A[0].length];
            for (int i = 0; i < A.length; i++){
                for (int j = 0; j < A[0].length; j++){
                    int result = A[i][j] + B[i][j];
                    newMatrix[i][j] = result;
                }
            }
            return newMatrix;
        }
    }

    public static int[][] mult(int[][] A, int[][] B){
        int rowA = A.length;
        int columnA = A[0].length;
        int rowB = B.length;
        int columnB = B[0].length;

        if (columnA != rowB){
            System.out.println("matrix dimensions do not match each other!");
            int[][] empty = new int[0][0];
            return empty;
        }
        else {
            // create matrix
            int[][] newMatrix = new int[rowA][columnB];

            for (int i = 0; i < rowA; i++){ // new matrix row
                for (int j = 0; j < columnB; j++){ // new matrix column
                    for(int k = 0; k < columnA; k++){
                        newMatrix[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            return newMatrix;
        }
    }

    public static void print(int[][] twoDim){
        System.out.println("MATRIX: ");
        for (int[] row : twoDim) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }}