/* Write a Java program to check if a string  is subsequence of another string 

Sample  Testcases:
case1:
Enter Required subsequence string                                                                                       
code                                                                                                                    
Enter  string                                                                                                           
cportde                                                                                                                 
Yes
case2:
Enter Required subsequence string                                                                                       
abc                                                                                                                     
Enter  string                                                                                                           
abdef                                                                                                                   
No                                                                                                                      


*/
import java.util.*;
class SubSequence
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s,sub;
        System.out.println("Enter Required subsequence string");
        
        sub=sc.nextLine();
        System.out.println("Enter string");
        
        s=sc.nextLine();
        if(isSubSequence(s,sub)==false)
        System.out.println("No");
        else
        System.out.println("Yes");
        
        
    }
    public static boolean isSubSequence(String a,String b)
    {
        int ind=0;
        int newind=0;
        for(int i=0;i<b.length();i++)
        {
            Character p=b.charAt(i);
            newind=a.indexOf(p,ind);
            if(newind==-1)
                return false;
            ind=newind;
            
            
        }
        return true;
    }
}