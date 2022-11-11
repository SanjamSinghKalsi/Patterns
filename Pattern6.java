1 2 3 4 5
1 2 3 4
1 2 3 
1 2  
1 
  
  
class Solution {

    void printTriangle(int n) {
         while(n>=1){
            for(int i=1;i<=n;i++){
                System.out.print(i+" ");
              }  
              System.out.println("");
              n--;
         }
       
    }
}
