/*Write a class called ArmstrongNumber with an instance method chkArmstrong which takes an 
integer as parameter and returns a boolean.
The chkArmstrong() method should check if the given number is Armstrong or not if it is 
Armstrong return true else return false
write an executable class called Test with a main method and create an instance for 
ArmstrongNumber and1 invoke the method chkArmstrong()
The main method should read the integer n and pass the integer n to the method chkAmstrong().
for other boundary condtions print -1.    

Note: An Armstrong number is an integer such that the sum of the cubes of its digits is equal 
to the number itself. 
For example, 371 is an Armstrong number since 3^3 + 7^3 + 1^3 = 371. 

input=153
output=true
    
input=123
output=false
*/
import java.util.Scanner;
import java.lang.Math;

class ArmstrongNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        System.out.println(-1);
        else
        System.out.println(isArms(n));
        
    }
    public static boolean isArms(int n)
    {
        int i,j;
        int k=n,sum=0;
        while (k>0)
        {
            sum+=Math.pow((k%10),3);
            k=k/10;
        }
        if (sum == n)
            return true;
        else
            return false;

    }
}