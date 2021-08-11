package desafiosMatematicosEmJava;

import java.io.IOException;
import java.util.Scanner;

public class InferiorAreaMatrix {

    static Scanner r = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        var M = new double[12][12];
        var o = r.next().toUpperCase().charAt(0);
        populateMatrix(M);

        System.out.printf("%.1f", o == 'S' ? getInferiorAreaSum(M) : getAverage(M));
    }

    // Método que retorna a soma dos valores da área abaixo das diagonais em uma matriz quadrada de ordem par
    public static double getInferiorAreaSum(double[][] matrix) {
        var sum = 0;
        var actualIndexX = 1;
        var actualLimitX = matrix.length-2;

        for (int i = matrix.length-1; i > matrix.length/2 ; i--) {
            for (int j = actualIndexX; j <= actualLimitX ; j++) {
                sum += matrix[i][j] ;
            }
            actualLimitX--;
            actualIndexX++;
        }
        return sum;
    }
    public static double getAverage(double[][] M) {
        return getInferiorAreaSum(M) / 30.0;
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