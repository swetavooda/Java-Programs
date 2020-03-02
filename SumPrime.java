/*
Write a program to find the sum of prime digits of a given number 
input = 245
output = 7
prime digits of 245 are 2 and 5 
sum of 2 and 5 is 7 
Note :- If no primes are present print '0'
input = 237
output = 12

input = 44
output = 0
*/
import java.util.Scanner;

class SumPrime
{
    public static void main(String args[])
    {
        int s;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
        int n=s,t;
        while(n>0)
        {
            t=n%10;
            n/=10;
            if(isPrime(t))
                sum+=t;
        
            
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int n)
    {
        if(n==1)
        return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}

