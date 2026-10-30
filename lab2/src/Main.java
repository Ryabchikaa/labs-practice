import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Выберите задание: ");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                System.out.print("Введите количество элементов массива: ");
                int n = scanner.nextInt();
                int[] arr = new int[n];

                System.out.println("Введите элементы массива:");
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }

                boolean isDecreasing = true;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] <= arr[i + 1]) {
                        isDecreasing = false;
                        break;
                    }
                }

                if (isDecreasing) {
                    System.out.println("Массив является убываюзим");
                } else {
                    System.out.println("Массив не является строго убывающим");
                }
                break;

            case 2:
                System.out.print("Введите количество строк матрицы: ");
                int rows = scanner.nextInt();
                System.out.print("Введите количество столбцов матрицы: ");
                int cols = scanner.nextInt();

                double[][] matrix = new double[rows][cols];

                System.out.println("Заполните матрицу числами:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        //   matrix[i][j] = scanner.nextInt();
                        matrix[i][j] = (int)(Math.random()*10);

                    }
                }



                double minVal = matrix[0][0];
                int minRow = 0;
                int minCol = 0;

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] < minVal) {
                            minVal = matrix[i][j];
                            minRow = i;
                            minCol = j;
                        }
                    }
                }


                int limit = Math.min(rows, cols);
                for (int k = 0; k < limit; k++) {
                    double temp = matrix[minRow][k];
                    matrix[minRow][k] = matrix[k][minCol];
                    matrix[k][minCol] = temp;
                }

                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.printf("%4d ", matrix[i][j]);
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Ошибка");
                break;
        }

        scanner.close();
    }
}