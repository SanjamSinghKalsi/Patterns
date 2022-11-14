A
BB
CCC
DDDD
EEEEE



class Solution {

    void printTriangle(int n) {
        // code here
        int incre= 1;
         char alpha = 65;
        while(n>0){
           
            for(char i=65;i<incre+65;i++){
                System.out.print(alpha);
            
            }
            alpha++;
            System.out.println("");
            
            incre++;
            n--;
        }
    }
}
