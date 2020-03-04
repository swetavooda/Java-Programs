/*
 
Write a Program to find the common string(s) of 2 arrays of strings.
 

Input:ram Laxman krishna
ram Seetha raju

Output: ram

Explanation :
First line of input represents strings(without space) array 1
Second line of input represents strings(without space) array 2
output is common strings between two array i.e ram.
length of 2 arrays of strings can be different also.

*/
import java.util.Scanner;
import java.util.*;
class CommonString
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String sarr1[] = s.split(" ");
        String s2=sc.nextLine();
        //String s2=nextLine();
        String sarr2[] = s2.split(" ");
        TreeSet<String> st1= new TreeSet<String>();
        TreeSet<String> st2=new TreeSet<String>();
        for(String i:sarr1)
        {
            st1.add(i);
        }
        for(String i:sarr2)
        {
            st2.add(i);
        }
        
        st1.retainAll(st2);
        for (String i:st1)
        System.out.println(i);
    }
}
