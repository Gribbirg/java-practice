package Practice_4_1.Ex_4;

import ForAll.Messages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("4");

        Scanner scanner = new Scanner(System.in);

        // ввод информации о матрицах
        System.out.println("Введите данные матрицы:");
        Matrix matrix1 = enterMatrix(scanner);
        System.out.println("Матрица:");
        matrix1.printMatrix();
        System.out.println();

        System.out.println("Введите данные второй матрицы:");
        Matrix matrix2 = enterMatrix(scanner);
        System.out.println("Вторая матрица:");
        matrix2.printMatrix();
        System.out.println();

        // суммирование
        Matrix sum = Matrix.sum(matrix1, matrix2);
        if (sum == null) System.out.println("Сложение матриц невозможно из-за разности из размеров!");
        else {
            System.out.println("Матрица - сумма:");
            sum.printMatrix(); // вывод суммы
        }
        System.out.println();

        // умножение на число
        System.out.print("Введите число, на которое умножить матрицу: ");
        double mul = scanner.nextDouble();
        System.out.println("Матрица после умножения:");
        Matrix.multiplication(matrix1, mul).printMatrix();
    }

    private static Matrix enterMatrix(Scanner scanner) {
        System.out.print("Введите кол-во строк у матрицы: ");
        int linesCount = scanner.nextInt();
        System.out.print("Введите кол-во столбцов у матрицы: ");
        int columnsCount = scanner.nextInt();
        System.out.println("Введите значения:");
        double[][] numbers = new double[linesCount][columnsCount];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(i + " " + j + ": ");
                numbers[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        return new Matrix(numbers, linesCount, columnsCount);
    }
}
