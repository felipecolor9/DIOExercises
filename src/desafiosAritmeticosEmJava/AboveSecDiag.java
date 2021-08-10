package desafiosAritmeticosEmJava;

import java.io.IOException;
import java.util.Scanner;

public class AboveSecDiag {
    static Scanner r = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        var o = r.next().toUpperCase().charAt(0);
        var M = new double[12][12];

        populateMatrix(M);
        var sum = matrixAboveDiagonalSum(M);

        if (o == 'M') { sum /= ((M.length * M.length) - 12) / 2; }  // 66
        System.out.println(String.format("%.1f", sum));
    }

    // Método que retorna a soma dos valores acima da diagonal secundária
    public static double matrixAboveDiagonalSum(double[][] matrix) {
        var sum = 0;
        for (int i = 0; i < matrix.length-1; ++i) {
            for (int j = 0; j < (matrix.length-1) - i; ++j) {
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