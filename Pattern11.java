1 
0 1 
1 0 1
0 1 0 1 
1 0 1 0 1
  

    void printTriangle(int n) {
        int incre = 1;
        while(n>=1){
            if(incre % 2 ==0){
              for(int i=1;i<=incre;i++){
                  if(i%2==0){
                      System.out.print(1+" ");
                  }
                  else{
                      System.out.print(0+" ");
                  }
                }  
            }
            else{
               for(int i=1;i<=incre;i++){
                   if(i%2==0){
                       System.out.print(0+" ");
                   }
                else{
                     System.out.print(1+" ");
                }
            }  
            }
            System.out.println("");
            incre++;
           n--;
        }
    }
