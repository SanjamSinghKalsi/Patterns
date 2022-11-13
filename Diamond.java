    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *
    

 
class Solution {

    void printDiamond(int n) {
        int incre = 1;
        int temp = n;
        while(n>0){
            for(int i=1;i<n;i++){
                System.out.print(" ");
            }
            for(int i=1;i<=incre;i++){
            System.out.print("* ");
        }
        System.out.println("");
        n--;
        incre++;
        }
         //System.out.println(n);
         int down =1;
         while(temp>0){
             
             for(int i=1;i<down;i++){
                System.out.print(" ");
            }
             for(int i=1;i<=temp;i++){
                 System.out.print("* ");
             }
              System.out.println("");
              temp--;
              down++;
         }
       
        
    }
}
