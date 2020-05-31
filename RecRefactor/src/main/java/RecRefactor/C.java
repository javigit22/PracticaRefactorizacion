/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecRefactor;

/**
 *
 * @author JC
 */
public class C {
    
    static void doC(int[][] c, int n) 
    { 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) 
                System.out.print(c[i][j] + " "); 
            System.out.println(); 
        } 
    } 
}
