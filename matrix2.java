public class matrix2 {
    public static void main(String []args){
        int m[][]={{1,1,1},{1,0,1},{1,1,1}};

        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }

         System.out.println();
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
            if(m[i][j]==0){
                m[i][0]=m[i][0]*0;
            }
               
            }
           
        }

         System.out.println();
    for(int i=0;i<m.length;i++){
        if(m[0][1]==0){
            m[0][i]=m[0][i]*0;
        }
    }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }

    float x=9,y=5;
    int z=(int)(x/y);
    System.out.println(z);
        
    }
}
