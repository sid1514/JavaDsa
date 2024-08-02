import java.util.*;
public class s1 {
    public static void main(String[]args){
        String str="hello hii";
        String temp=" ";
        int c=0;
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i)=='a'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                c=c+1;
            }
            if(str.charAt(i)==' '){
                System.out.println(c);
                c=0;
            }
        }

        System.out.println(c);


       String str1=" logic the write not will we ";
Stack<Character> sk=new Stack<Character>();
//str1=str1+ " ";
for(int i=str1.length()-1;i>=0;i--){
 sk.push(str1.charAt(i));
 



   if(str1.charAt(i)==' ')
   {
       while(sk.size()>0)
        {  
            System.out.print (sk.pop());
        }
        System.out.print (" ");
    }
    
    }

    System.out.println();
    for(String s:str1.split(" ")){
        System.out.println(s);
    }

  String str2="willow";
  
    }
}

