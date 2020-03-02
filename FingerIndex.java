/*
here is a special keyboard with all keys in a single row.
Given a string keyboard of length 26 indicating the layout of the keyboard (indexed from 0 to 25), initially your finger is at index 0. 
To type a character, you have to move your finger to the index of the desired character. 
The time taken to move your finger from index i to index j is |i - j|.
You want to type a string word. Write a function to calculate how much time it takes to type it with one finger.
Example 1:
input = abcdefghijklmnopqrstuvwxyz
cba
output = 4
Explanation: The index moves from 0 to 2 to write 'c' then to 1 to write 'b' then to 0 again to write 'a'.
Total time = 2 + 1 + 1 = 4. 
Example 2:
input = pqrstuvwxyzabcdefghijklmno
leetcode
output = 73
Constraints:
   keyboard.length == 26
   keyboard contains each English lowercase letter exactly once in some order.
   1 <= word.length <= 10^4
   word[i] is an English lowercase letter.
Note :- For all Boundary Conditions print -1


*/
import java.util.Scanner;

class FingerIndex
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s,p;
        int n=0;
        s=sc.nextLine();
        p=sc.nextLine();
        int i=0,present_pos=0,ind;
        char ch;
        if(s.length()!=26)
        {
            System.out.println(-1);
        }
        else
        {
            while(i<p.length())
            {
                ch=p.charAt(i);
                ind=s.indexOf(ch);
                n+=Math.abs(present_pos-ind);
                present_pos=ind;
                i++;

            }
            System.out.println(n);   
        }        
    }
}