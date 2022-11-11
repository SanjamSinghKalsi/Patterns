    *
   ***  
  *****
 *******
*********



class Solution {

    void printTriangle(int n) {
        // code here
        int star=1;
        int temp = n;
        while(n>=1){
            while(temp>1){
                System.out.print(" ");
                temp--;
            }
            for(int i =1;i<=star;i++){
                
                System.out.print("*");
            }
               System.out.println("");
            n--;
            temp = n;
            star = star+2;
        }
    }
}
