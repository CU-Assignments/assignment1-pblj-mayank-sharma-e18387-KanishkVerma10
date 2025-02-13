import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows and columns for matrices: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements of Matrix 1:");
        readMatrix(scanner, matrix1, rows, cols);

        System.out.println("Enter elements of Matrix 2:");
        readMatrix(scanner, matrix2, rows, cols);

        System.out.println("Addition:");
        printMatrix(addMatrices(matrix1, matrix2, rows, cols));

        System.out.println("Subtraction:");
        printMatrix(subtractMatrices(matrix1, matrix2, rows, cols));

        System.out.print("Enter number of columns for Matrix 2 (for multiplication): ");
        int cols2 = scanner.nextInt();

        int[][] matrix2Multiplication = new int[cols][cols2];
        System.out.println("Enter elements of Matrix 2 (for multiplication):");
        readMatrix(scanner, matrix2Multiplication, cols, cols2);

        System.out.println("Multiplication:");
        printMatrix(multiplyMatrices(matrix1, matrix2Multiplication, rows, cols, cols2));

        scanner.close();
    }

  
    private static void readMatrix(Scanner scanner, int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }


    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

  
    private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }



 
