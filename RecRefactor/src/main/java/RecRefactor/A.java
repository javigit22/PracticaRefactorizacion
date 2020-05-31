package RecRefactor;

import java.util.Random;

/**
 * @author javic
 * 
 * Este tipo de comentarios de documentación
 * no tendrían sentido dentro de la doctrina Clean Code
 * salvo que estemos desarrollando código para un API público
 */
public class A {

    static int m = 4;
    static int n = 4;
    
    /**
    * Este método crea una matriz bidimensional cuadrada de dimensión N
    * @param c matriz
    * @param n dimensión de la matriz
    * @version 1.00
    */
    static void crearMatriz(int[][] c, int n) {

        Random r = new Random();

        int i, j;

        int x = 1;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                c[i][j] = r.nextInt(100);
            }
        }

    }

    /**
    * Este método imprime por pantalla la matriz
    */
    static void printMatriz(int[][] c, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
    * Este método ordena la matriz de menor a mayor
    */
    static void ordenarMenorMayor(int[][] a, int n) {

        int[] t = new int[n * n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[k++] = a[i][j];
            }
        }

        int m = t.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int x = 0; x < n; x++) {
                    for (int y = 0; y < n; y++) {
                        if (a[i][j] < a[x][y]) {
                            int q = a[i][j];
                            a[i][j] = a[x][y];
                            a[x][y] = q;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] c = new int[m][n];
        crearMatriz(c, 4);

        int i, j;

        printMatriz(c, 4);
        System.out.println("---");
        ordenarMenorMayor(c, 4);
        System.out.println("---");
        printMatriz(c, 4);
        int rs = 0;

        for (i = 0; i < 4; ++i) {
            for (j = 0; j < 4; ++j) {

                rs = rs + c[i][j];
            }

            System.out.println("rs "
                    + i + " = " + rs);

            rs = 0;

        }

        int cs = 0;

        for (i = 0; i < 4; ++i) {
            for (j = 0; j < 4; ++j) {

                cs = cs + c[j][i];
            }

            System.out.println("cs "
                    + i + " = " + cs);

            cs = 0;
        }
    }

}
