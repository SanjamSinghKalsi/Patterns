ABCDE
ABCD
ABC
AB
A

class Solution {

    void printTriangle(int n) {
        // code here
        while(n>0){
            
            for(char i=65;i<n+65;i++){
                System.out.print(i);
            }
            System.out.println("");
            
            n--;
        }
    }
}
