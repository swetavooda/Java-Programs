/*

Find Anagram Mappings
Given two arrays A and B, and B is an anagram of A. B is an anagram of A means B is made by randomizing the order of the elements in A.
We want to find an index mapping P, from A to B. A mapping P[i] = j means the ith element in A appears in B at index j.
Assume The lists A and B may not contain duplicates. 
For example, given
input = 5
12 28 46 32 50
50 12 32 46 28
output =
1 4 3 2 0
Explanation
as P[0] = 1 because the 0th element of A appears at B[1], and P[1] = 4 because the 1st element of A appears at B[4], and so on.
Note:
    A, B have equal lengths in range [1, 100].
    A[i], B[i] are integers in range [0, 10^5].
Note - If the array doesnt contains the elements print -1 in the place of index 
input = 5
12 28 46 32 50
50 12 32 406 28
output =
1 4 -1 2 0
*/
import java.util.*;
class AnagramMapping
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
        Map<String,Integer> m1 = new HashMap<String,Integer>();
        Map<String,Integer> m2 = new HashMap<String,Integer>();
        int k=0;
        for (String i:arr1)
        {
            m1.put(i,k++);
        }
        k=0;
        for (String i:arr2)
        {
            m2.put(i,k++);
        }
        
        for (String i:arr1)
        {
            if(m2.get(i)!=null)
            System.out.print(m2.get(i)+" ");
            else
                System.out.print(-1+" ");
        }
        
    } 
}
