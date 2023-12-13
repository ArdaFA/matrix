import matrix.Matrix;

class Main {
    public static void main(String[] args) {

        int[][] A = {
                {1,2},
                {3,4},
                {5,6}
        };

        System.out.println(" ");
        int[][] B = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int[][] C = {
                {1,2,3,4},
                {5,6,7,8}
        };
        System.out.println("FIRST MATRIX: ");
        Matrix.print(A);
        System.out.println("SECOND MATRIX: ");
        Matrix.print(B);
        System.out.println("THIRD MATRIX: ");
        Matrix.print(C);
        System.out.println(" ");

        int[][] transposedMatrixA = Matrix.transpose(A);
        // Print the transposed matrix
        System.out.println("Transposed A ");
        Matrix.print(transposedMatrixA);
        System.out.println(" ");

        int[][] transposedMatrixB = Matrix.transpose(B);
        // Print the transposed matrix
        System.out.println("Transposed B ");
        Matrix.print(transposedMatrixB);
        System.out.println(" ");

        int[][] transposedMatrixC = Matrix.transpose(C);
        // Print the transposed matrix
        System.out.println("Transposed C ");
        Matrix.print(transposedMatrixC);
        System.out.println(" ");

        int[][] sumMatrix = Matrix.add(B, B);
        // print the sum of matrix with itself
        System.out.println(" B + B ");
        Matrix.print(sumMatrix);

        System.out.println(" ");

        int[][] multMatrix = Matrix.mult(A, B);
        // print the result
        System.out.println(" A * B ");
        Matrix.print(multMatrix);
        System.out.println(" ");

        int[][] multMatrix1 = Matrix.mult(A, C);
        // print the result
        System.out.println(" A * B ");
        Matrix.print(multMatrix1);

    }

}