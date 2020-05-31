
package RecRefactor;

import java.util.Random;

public class A {

    static int m = 4; 
    static int n = 4; 
    
    static void printMatriz(int[][] c, int n) 
    { 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " "); 
            }
            System.out.println(); 
        } 
    } 
    
    static void ordenarMenorMayor(int[][] a, int n) 
    { 
         
        int[] t = new int[n * n]; 
        int k = 0; 
      
    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                t[k++] = a[i][j]; 
            }
        }
      
        
        int m = t.length;
        for( int i=0; i < n; i++){
            for( int j=0;j< n; j++){
                for(int x=0; x < n; x++){
                    for(int y=0; y < n; y++){
                        if(a[i][j] < a[x][y]){
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
        
        
         Random r = new Random();
         
        int [][]a = new int[m][n]; 
     int i,j;
     
    
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
