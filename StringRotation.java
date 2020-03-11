/* Write a C Program to determine whether one string is a rotation of another
use string handling functions.
Note:
    String 1: abcde  
    String 2 : deabc  
    String 1 + String 1: abcdeabcde  
Consider above example, suppose we need to check whether string 2 is a rotation
of string 1.To find this, we concatenate string 1 with string 1. Then, try to
find the string 2 in concatenated string.If string 2 is present in concatenated
string then, string 2 is rotation of string 1.String 2 deabc is found on 
the index 3 in concatenated string. So, deabc is rotation of abcde.

Test case 1:
Enter two strings
abcde
deabc
Second string is a rotation of first string
Test case 2:
Enter two strings
abcdef
fedcba
Second string is not a rotation of first string
Test case 3:
Enter two strings                                                                                                       
welcome                                                                                                                 
kmit                                                                                                                    
Second string is not a rotation of first string                                                                         
*/
import java.util.*;
class StringRotation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1,s2;
        s1=sc.nextLine();
        s2=sc.nextLine();
        String s3=s1.concat(s1);
        if(s3.contains(s2)==true)
        System.out.println("Second string is a rotation of first string");
        else
        System.out.println("Second string is not a rotation of first string");
        
    }
}