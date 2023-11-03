package Practice_4_1.Ex_4;

public class Matrix {
    public double[][] numbers;
    public int linesCount;
    public int columnsCount;

    public Matrix(double[][] numbers, int linesCount, int columnsCount) {
        this.numbers = numbers;
        this.linesCount = linesCount;
        this.columnsCount = columnsCount;
    }

    public Matrix(int linesCount, int columnsCount) {
        this.linesCount = linesCount;
        this.columnsCount = columnsCount;
        this.numbers = new double[linesCount][columnsCount];
    }

    // вывод матрицы
    public void printMatrix() {
        for (double[] columns : numbers) {
            for (double number : columns) {
                System.out.printf("%10s", number);
            }
            System.out.println();
        }
    }

    // конструктор копирования
    public Matrix(Matrix matrix) {
        columnsCount = matrix.columnsCount;
        linesCount = matrix.linesCount;
        numbers = new double[linesCount][columnsCount];
        for (int i = 0; i < matrix.linesCount; i++)
            for (int j = 0; j < matrix.columnsCount; j++)
                numbers[i][j] = matrix.numbers[i][j];
    }

    // суммирование матриц
    public static Matrix sum(Matrix matrix1, Matrix matrix2) {

        if (matrix1.linesCount != matrix2.linesCount | matrix1.columnsCount != matrix2.columnsCount) return null;

        Matrix ans = new Matrix(matrix1.linesCount, matrix1.columnsCount);

        for (int i = 0; i < matrix1.linesCount; i++)
            for (int j = 0; j < matrix1.columnsCount; j++)
                ans.numbers[i][j] = matrix1.numbers[i][j] + matrix2.numbers[i][j];

        return ans;

    }

    // умножение на число
    public static Matrix multiplication(Matrix matrix, double number) {
        Matrix ans = new Matrix(matrix);
        for (int i = 0; i < matrix.linesCount; i++)
            for (int j = 0; j < matrix.columnsCount; j++)
                ans.numbers[i][j] *= number;
        return ans;
    }
}
