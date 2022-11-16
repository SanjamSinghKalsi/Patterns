E
E D
E D C
E D C B
E D C B A


class Solution {

    void printTriangle(int n) {
        // code here
        int temp = n;
        int check = 65+temp-1;
        char check1 = (char)check;
        while(n>0){
            
            for(char i = check1;i>=65+n-1;i--){
                System.out.print(i+" ");
            }
            System.out.println("");
            n--;
        }
    }
}
