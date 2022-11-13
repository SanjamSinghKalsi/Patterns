*********
 *******
  *****
   ***
    *

class Solution {

    void printTriangle(int n) {
        int total = 1;
        // for(int i=1;i<=n;i+=2){
        //     total += i;
        // }
        while(n>1){
            total = total +2;
            n--;
        }
        //System.out.print(total);
        int temp = 0;
      
        int space = 1;
        while(total>=1){
            for(int i = 0;i<total;i++){
                 System.out.print("*");
            }
            System.out.println("");
            temp = space;
           while(temp!=0){
                System.out.print(" ");
                temp--;
           }
            space+=1;
            total-=2;
        }
       
    }
}
