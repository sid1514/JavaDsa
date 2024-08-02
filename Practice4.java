import java.util.*;
public class Practice4 {
    public static void main (String args[]){
        int a[]={5,3,4,6,7,5,3,6,2,5,6,7};
        Set <Integer> s=new HashSet<Integer>();
        Set <Integer> s1=new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            if(!s.add(a[i])){
                s1.add(a[i]);
            }
        }
        System.out.println(s1);
       
        int a1[]={4,6,1,2,14,3,8,9,12};
        Arrays.sort(a1);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<a1.length;i++){
        System.out.println(a1[i]);}
        System.out.println(a1[n]);

        String str="asdsab";

       
       
         
    }
}
