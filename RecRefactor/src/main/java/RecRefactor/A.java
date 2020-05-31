
package RecRefactor;

import java.util.Random;

/**
 *
 * @author JC
 */
public class A {

    static int m = 4; 
    static int n = 4; 
    
    public static void main(String[] args) {
        
        
         Random r = new Random();
         
        int [][]a = new int[m][n]; 
     int i,j;
     
    
    int x = 1; 
    for (i = 0; i < m; i++) 
        for (j = 0; j < n; j++) 
            a[i][j] = r.nextInt(100);
        
        
        C.doC(a, 4);
        System.out.println("---");
        B.doB(a, 4);
        System.out.println("---");
        C.doC(a, 4);
        int rs = 0; 
        
        
  
        // finding the row rs 
        for (i = 0; i < 4; ++i) { 
        for (j = 0; j < 4; ++j) { 
  
            // Add the element 
            rs = rs + a[i][j]; 
        } 
  
        // Print the row rs 
        System.out.println("rs "
            + i + " = " + rs); 
          
        // Reset the rs 
        rs = 0; 
        
        }
        
        int cs = 0; 
  
   
  
    // finding the column cs 
    for (i = 0; i < 4; ++i) { 
        for (j = 0; j < 4; ++j) { 
  
            // Add the element 
            cs = cs + a[j][i]; 
        } 
  
        // Print the column cs 
        System.out.println("cs "
            + i + " = " + cs); 
  
        // Reset the cs 
        cs = 0; 
    } 
    } 
        
    
    
}
