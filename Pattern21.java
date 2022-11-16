****
*  *
*  *
****


class Solution {

    void printSquare(int n) {
        // code here
        int temp = n;
        while(n>0){
            if(n==temp || n==1){
                for(int i=temp;i>=1;i--){
                    System.out.print("*");
                    }
            }
            else{
                System.out.print("*");
                for(int i = 1;i<=temp-2;i++){
                    System.out.print(" ");
                }
                 System.out.print("*");
            }
          
            
            System.out.println("");
            n--;
        }
    }
}
