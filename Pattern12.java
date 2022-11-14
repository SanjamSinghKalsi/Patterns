1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1
  
  
class Solution {

    void printTriangle(int n) {
        int incre=1;
        int space = n-1;
        while(n>0){
          for(int i=1;i<=incre;i++){
            System.out.print(i+" ");
        }
        for(int i=1;i<=space;i++){
            System.out.print("  ");
        }
        for(int i=1;i<=space;i++){
            System.out.print("  ");
        }
        for(int i = incre;i>=1;i--){
            System.out.print(i+" ");
        }
        
        System.out.println("");
        n--;
        incre++;
        space--;
        }
        
      
    }
}
