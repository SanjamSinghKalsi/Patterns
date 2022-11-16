*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *



class Solution {

    void printTriangle(int n) {
        int incre = 1;
        int space = 2 * (n-1);
        int temp = n-1;
        while(n>0){
            
            for(int i=1;i<=incre;i++){
                System.out.print("*");
            }
            
            for(int i = space;i>=1;i--){
                System.out.print(" ");
            }
            
             for(int i=1;i<=incre;i++){
                System.out.print("*");
            }
            System.out.println("");
            incre++;
            space-=2;
            n--;
        }
        space = space +4;
        while(temp>0){
            
            for(int i = temp;i>=1;i--){
                System.out.print("*");
            }
            for(int i = 1;i<=space;i++){
                System.out.print(" ");
            }
             for(int i = temp;i>=1;i--){
                System.out.print("*");
            }
            System.out.println("");
            space+=2;
            temp--;
        }
    }
}
