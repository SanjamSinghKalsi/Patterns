A
AB
ABC
ABCD
ABCDE


class Solution {

    void printTriangle(int n) {
        int incre = 1;
        while(n>0){
            for(char i = 65;i<incre+65;i++){
                System.out.print(i);
            }
            System.out.println("");
            incre++;
            n--;
        }
    }
}
