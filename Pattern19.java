**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********



class Solution {

    void printTriangle(int n) {
        // code here
        int space= 0;
        int temp = n;
        int incre= 1;
        while(n>0){
            for(int i=1;i<=n;i++){
                System.out.print("*");
            }
            for(int i=space;i>0;i--){
                System.out.print(" ");
            }
            for(int i=1;i<=n;i++){
                System.out.print("*");
            }
            System.out.println("");
            n--;
            space+=2;
        }
        space = space-2;
        while(temp>0){
            for(int i=1;i<=incre;i++){
                  System.out.print("*");
            }
            for(int i=space;i>0;i--){
                  System.out.print(" ");
            }
             for(int i=1;i<=incre;i++){
                  System.out.print("*");
            }
            System.out.println("");
            incre++;
            temp--;
            space-=2;
        }
    }
}
