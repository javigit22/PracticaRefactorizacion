
package RecRefactor;

public class C {
    
    static void printMatriz(int[][] c, int n) 
    { 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " "); 
            }
            System.out.println(); 
        } 
    } 
}
