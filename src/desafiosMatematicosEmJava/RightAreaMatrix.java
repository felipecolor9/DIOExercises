package desafiosMatematicosEmJava;

import java.io.IOException;
import java.util.Scanner;

public class RightAreaMatrix {
    static Scanner r = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        var M = new double[12][12];
        var o = r.next().toUpperCase().charAt(0);

        populateMatrix(M);
        System.out.printf("%.1f", o == 'S' ? getLeftAreaSum(M) : getAverage(M));
    }

    // Método que retorna a soma dos valores da área direita as diagonais em uma matriz quadrada de ordem par
    public static double getLeftAreaSum(double[][] matrix) {
        var sum = 0;
        var actualIndexY = 1;
        var actualLimitY = matrix.length-2;

        for (int i = matrix.length-1; i > matrix.length/2 ; i--) {
            for (int j = actualIndexY; j <= actualLimitY ; j++) {
                sum += matrix[j][i] ;
            }
            actualLimitY--;
            actualIndexY++;
        }
        return sum;
    }

    public static double getAverage(double[][] M) {
        return getLeftAreaSum(M) / 30.0;
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