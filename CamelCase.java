/*
write a program to find if a given positive number is a Camel Case Number or Not
A number is said to be Camel Case Number if the First digit of the number is always greater than 
or equal to the digits which are right side to it and
if a number contains a single digit it is always assumed it as a Camel Case 
if the given Number is Camel Case Print "Camel Case" else print "Not Camel Case"

if any negative number is given print "Not Camel Case"
input = 543
output = Camel Case
input = 582
output = Not Camel Case
input = 3
output = Camel Case
input = 22
output = Camel Case
*/
import java.util.Scanner;

class CamelCase
{
    public static void main(String args[])
    {
        int n,flag=0,t;
        Scanner sc= new Scanner(System.in);
        String a;
        a=sc.next();
        char arr[]=a.toCharArray();
        int firstdigit=(int)arr[0];
        for(int i=1;i<arr.length;i++)   
        {
            if(firstdigit<arr[i])
            {
                flag=1;
                System.out.println("Not Camel Case");
                break;
            }
        }
                
            
                if(flag==0)
            System.out.println("Camel Case");
        
        
    }
}