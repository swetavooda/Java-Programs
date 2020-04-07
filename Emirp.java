/*Write a program to check if given number is Emirp Number or not
An Emirp Number (prime spelled backwards) is a prime number that results in a different prime 
when all its digits are reversed. This definition excludes the related palindromic primes.
If it is a Emirp number print 1 else print -1

Example:
input=13
output=1

Explanation :
13 and 31 are both prime numbers. 
Thus, 13 is an Emirp number.

input=27
output=-1
*/

import java.util.Scanner;
class Emirp
{
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=palindrome(n1);
        if(prime(n1)&&prime(n2))
        System.out.println(1);
        else
        System.out.println(-1);
        
        
    }
    public static int palindrome(int a)
    {
        int n=a;
        int num=0;
        int fin=0;
        while(n>0)
        {
            num=n%10;
            fin=(fin*10)+num;
            n/=10;
            
        }
        return (fin);
    }
    
    public static boolean prime(int n)
    {
        int i,j,a,b;
        int sum=0,flag;
            for(j=2;j<n;j++)
            {
                if(n%j==0 && n!=j)
                    return false;
                
            }
        return true;
            
        }
        
    }
    