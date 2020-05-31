
package RecRefactor;

import java.util.Random;

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
        
        
  
        for (i = 0; i < 4; ++i) { 
        for (j = 0; j < 4; ++j) { 
  
            rs = rs + a[i][j]; 
        } 
  
        System.out.println("rs "
            + i + " = " + rs); 
          
        rs = 0; 
        
        }
        
        int cs = 0; 
  
   
  
    for (i = 0; i < 4; ++i) { 
        for (j = 0; j < 4; ++j) { 
  
            cs = cs + a[j][i]; 
        } 
  
        System.out.println("cs "
            + i + " = " + cs); 
  
        cs = 0; 
    } 
    } 
        
    
    
}
