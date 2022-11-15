   A
  ABA
 ABCBA
ABCDCBA



class Solution {

    void printTriangle(int n) {
        // code here
        int incre= 1;
        int space = n-1;
        
        while(n>0){
            char carry = 0;
            for(int i=space;i>=1;i--){
                System.out.print(" ");
            }    
            space--;
            for(char i=65;i<incre+65;i++){
                System.out.print(i);
                carry = i;
            }
       int convert  = carry;
       int diff = convert - 1;
       char check = (char)diff;
            for(char i=check;i>=65;i--){
                 System.out.print(i);
            }
            System.out.println("");
            incre++;
            n--;
        }
    }
}
