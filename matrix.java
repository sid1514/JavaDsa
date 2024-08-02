public class matrix{

    void show(int a[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }

    
    void sumoferows(int a[][],int r,int c){
        int s=0;
       for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+"\t");

                s=s+a[i][j];
            }
            System.out.print(" = "+s);
            s=0;
            System.out.println("\n");
        }
    }

    void sumofcol(int a[][],int r,int c){
        int s=0;
       for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+"\t");

                s=s+a[j][i];
            }
            System.out.print(" = "+s);
            s=0;
            System.out.println("\n");
    }
    }

    boolean isPrime(int n){
        int f=0;
        for(int i=2;i<n/2;i++){
            if(n%i!=0){
                
              f=1;  

            }
        }
        if(f==1){
        return true;}
        else{
            return false;
        }
    }
    public static void main(String []args){
        int a[][]={{4,6,7,8},{1,4,2,3},{9,8,6,5},{2,4,3,6}};
        matrix m=new matrix();
        int c=4,r=4;
        m.show(a,4,4);
      //  int f=1;
        System.out.println("\n");
         for(int i=0;i<4;i++)
         {
            if(i%2==0){
            for(int j=0;j<4;j++){
            
                System.out.print(a[i][j]+"\t");
                
            }
            } 
            else
            {
                for(int j=3;j>=0;j--)
                {
                        
                System.out.print(a[i][j]+"\t");

                }
            }
            
            System.out.println("\n");
         }

         System.out.println("\n");
        // int temp=0;
         for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
            if(j==0){
                System.out.print(a[i][3]+"\t");
            }
            else if(j==3){
            System.out.print(a[i][0]+"\t");}
            else{
                System.out.print(a[i][j]+"\t");
            }
            }
            System.out.println("\n");
        }
 System.out.println("\n");

        
       int a1[][]= {{4,1,7,1},{1,1,1,3},{9,8,6,5},{2,4,3,6}};
        int max=0;
        int max1=0;
        int maxrow=0;
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
                if(a1[i][j]==1){
                    max++;
                    
                }
               

                
            }
            
            if(max>max1){
                max1=max;
                maxrow=i;
            }
            System.out.println("\n");
            System.out.println(maxrow);
    }

for(int i=0;i<a1[maxrow].length;i++){
    System.out.print(a1[maxrow][i]+" ");
}


 System.out.println("\n");   
    for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
        {
            if(m.isPrime(a[i][j])==true)
            {
                System.out.print(a[i][j]+"\t");
            }
        }
        System.out.println("\n");
        }
       
    }
}