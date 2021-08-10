package desafiosMatematicosEmJava;

import java.io.IOException;
import java.util.Scanner;

public class RightAreaMatrix {
    static Scanner r = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        var M = new double[12][12];
        var o = r.next().toUpperCase().charAt(0);

        populateMatrix(M);
        var sum = matrixLeftAreaSum(M);

        if (o == 'M') { sum /= 30; }
        System.out.println(String.format("%.2f", sum));
    }

    // Método que retorna a soma dos valores da área direita das diagonais em uma matriz quadrada de ordem par
    public static double matrixLeftAreaSum(double[][] matrix) {
        var sum = 0;
        var maxRightArea = (matrix.length/2) -1; //5
        var maxRightAreaIndex = maxRightArea;

        for (int i = matrix.length-2; i >= matrix.length/2; i--) {
            for (int j = matrix.length-1; i < j ; j--) {
                sum += matrix[i][j];
            }
        }

        for (int i = maxRightAreaIndex; i > 0; i--) {
            for (int j  = maxRightArea+2; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
            maxRightArea++;
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