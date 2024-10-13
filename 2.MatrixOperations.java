import java.util.Scanner;

class Matrix {
    private int rows;
    private int columns;
    private int[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    public void setElement(int row, int col, int value) {
        data[row][col] = value;
    }

    public int getElement(int row, int col) {
        return data[row][col];
    }

    public Matrix add(Matrix other) {
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.setElement(i, j, this.getElement(i, j) + other.getElement(i, j));
            }
        }
        return result;
    }

    public Matrix subtract(Matrix other) {
        Matrix result = new Matrix(rows, columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.setElement(i, j, this.getElement(i, j) - other.getElement(i, j));
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        Matrix result = new Matrix(rows, other.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                for (int k = 0; k < columns; k++) {
                    result.setElement(i, j, result.getElement(i, j) + this.getElement(i, k) * other.getElement(k, j));
                }
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for Matrix 1
        System.out.println("Enter elements for Matrix 1 (3x3):");
        Matrix matrix1 = createMatrix(scanner);

        // Taking input for Matrix 2
        System.out.println("Enter elements for Matrix 2 (3x3):");
        Matrix matrix2 = createMatrix(scanner);

        // Perform matrix operations
        System.out.println("\nMatrix 1:");
        matrix1.print();

        System.out.println("\nMatrix 2:");
        matrix2.print();

        System.out.println("\nMatrix Addition:");
        Matrix resultAddition = matrix1.add(matrix2);
        resultAddition.print();

        System.out.println("\nMatrix Subtraction:");
        Matrix resultSubtraction = matrix1.subtract(matrix2);
        resultSubtraction.print();

        System.out.println("\nMatrix Multiplication:");
        Matrix resultMultiplication = matrix1.multiply(matrix2);
        resultMultiplication.print();

        scanner.close();
    }

    private static Matrix createMatrix(Scanner scanner) {
        Matrix matrix = new Matrix(3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                int element = scanner.nextInt();
                matrix.setElement(i, j, element);
            }
        }
        return matrix;
    }
}
