package desafiosAritmeticosEmJava;

import java.io.IOException;
import java.util.Scanner;

public class BelowMainDiag {
    static Scanner r = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        var M = new double[12][12];
        var o = r.next().toUpperCase().charAt(0);

        populateMatrix(M);
        var sum = matrixBelowMainDiagonalSum(M);

        if (o == 'M') { sum /= ((M.length * M.length) - 12) / 2; } // 66
        System.out.println(String.format("%.1f", sum));
    }

    // Método que retorna a soma dos valores abaixo da diagonal principal
    public static double matrixBelowMainDiagonalSum(double[][] matrix) {
        var sum = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i ; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // Valores de entrada da matriz
    public static void populateMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                matrix[i][j] = r.nextDouble();
            }
        }
    }
}