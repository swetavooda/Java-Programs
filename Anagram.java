/*Write a program to check if two numbers are anagrams or not 
input = 123
321
output = ANAGRAM
input = 121
113
output = NOT ANAGRAM
If Anagram Number print ANAGRAM else print NOT ANAGRAM
*/
import java.util.Scanner;
class Anagram{
public static void main(String args[])
{
    String a,b;
    Scanner sc = new Scanner(System.in);
    
    a=sc.nextLine();
    b=sc.nextLine();
    if(isAnagram(a,b))
    System.out.println("ANAGRAM");
    else
    System.out.println("NOT ANAGRAM");
    
    
}
public static boolean isAnagram(String a,String b)
{
    int n1=a.length();
    int n2=b.length();
    if(n1==n2)
    {
        int i=0,j=n2-1 ;
        while((i<n1) &&( j>=0))
        {
                String p,q;
                p=Character.toString(a.charAt(i));
                q=Character.toString(b.charAt(j));
                if (!(p.equals(q)))
                    return false;
                i++;
                j--;
        }
        return true;
    }
    else
    return false;
    
}
}

