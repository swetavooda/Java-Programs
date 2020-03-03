/*write a java program to read a positive number N(N>0)  print the no of divisors of
number N which are perfect squares.

input
36
output
4
for the number 36 the divisors are 
1  2 3 4 6 9 12 18 36
among the above divisors only 1,4,9,36 are perfect squares so the output is 4 

input
60
output
2
for the number 60 the divisors are 
1 2 3 4 5 6 10 12 15 20 30 
among the above divisors only 1,4 are perfect squares so the output is 2
But every number will have atleast '1' as divisors which is a perfect square 
so the output will be 1 
Assume the Number 'N" is a Postive Integer
*/
import java.util.*;
import java.lang.Math;
class PerfectSquare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0&&isSquare(i))
            {
                count++;
            }
        }     
        System.out.println(count);
    }
    public static boolean isSquare(double a)
    
    {
        int m=(int)Math.sqrt(a);
        if(m*m==a)
        return true;
        return false;
    }
    
}