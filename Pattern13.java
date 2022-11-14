1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
  
  
class Solution {

    void printTriangle(int n) {
        int incre = 1;
         int val =1;
        while(n>0){
           
            for(int i=1;i<=incre;i++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println("");
            n--;
            incre++;
        }
    }
}
