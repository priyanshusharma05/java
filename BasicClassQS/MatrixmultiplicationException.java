import java.util.Scanner;

public class MatrixmultiplicationException{

    public static int[][] inputMatrix(String name, Scanner scanner) {
        System.out.print("Enter the number of rows for " + name + ": ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for " + name + ": ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements for " + name + " (row by row):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix, String name) {
        System.out.println("\n" + name + ":");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException("Matrices are not compatible for multiplication (columns of Matrix 1 != rows of Matrix 2).");
        }

        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[][] matrix1 = inputMatrix("Matrix 1", scanner);
            int[][] matrix2 = inputMatrix("Matrix 2", scanner);

            printMatrix(matrix1, "Matrix 1");
            printMatrix(matrix2, "Matrix 2");

            int[][] result = multiplyMatrices(matrix1, matrix2);
            printMatrix(result, "Result of Multiplication");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}