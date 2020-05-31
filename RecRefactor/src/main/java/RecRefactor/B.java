
package RecRefactor;

import java.util.Arrays;

public class B {
    
    static void doB(int[][] a, int n) 
    { 
         
        int[] t = new int[n * n]; 
        int k = 0; 
      
    
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                t[k++] = a[i][j]; 
      
        
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
}
