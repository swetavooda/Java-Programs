/* Write a java program of a given sequence of numbers to find the number of sequence pairs
such that concatenation of those two numbers is a palindrome
Ex:
Input array: [90,56,45,65,54,97,8,79] 
 Ans: 3
 Explaination: [{56,65},{45,54},{97,79}]
 56+65=5665 is a palindrome
 45+54=4554 is a palindrome
 97+79=9779 is a palindrome
 
 
Sample Test case
Enter array size                                                                                                        
5                                                                                                                       
90                                                                                                                      
56                                                                                                                      
45                                                                                                                      
65                                                                                                                      
54                                                                                                                      
2       
*/
import java.util.*;
class Seq_pairs
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(isPalindrome(arr[i],arr[j])==true)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isPalindrome(int x,int y)
    {
        int sum,num,fin=0;
        int given;
        given=x;
        int n=given;
        while(n>0)
        {
            num=n%10;
            fin=(fin*10)+num;
            n/=10;
            
        }
        if(fin==y)
        return true;
        return false;
        
    }
}