import java.util.*;

public class Main{
    
    int show(String str)
    {
    if(str.length()==0)
    return 0;
    else{
    System.out.println(str.charAt(0));
    return show(str.substring(1));
    }}
       
    




   
    public static void main(String args[])
    {
    
       
        String word = "nitin";
        if (isPalindrome(word)) 
        {
            System.out.println(word + " is a palindrome.");
        } else 
        {
            System.out.println(word + " is not a palindrome.");
        }

        int a1=10;
       System.out.println(a1++);
       System.out.println(++a1);
       System.out.println(a1);
       System.out.println(--a1);
       System.out.println(a1);
       System.out.println(a1+1);
       System.out.println(a1);
       
    }

    public static boolean isPalindrome(String word) 
    {
        if (word.length() <= 1) 
        {
            return true;
        }

       
        if (word.charAt(0) == word.charAt(word.length() - 1)) 
        {
            return isPalindrome(word.substring(1, word.length() - 1));
        } else 
        {
            return false;
        }
	



    }
}