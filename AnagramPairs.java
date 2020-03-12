/*

Given a list of words  print all anagrams together.

For example  if the given list of words is {but,tac,god,act, dog, cat, tub}
then output would be groups of anagrams [but,tub][tac,act,cat][god, dog]


Sample Input:
pan nap god bat bag dog tub

Output :
[pan, nap]
[god, dog]


Note :
1) Print the group of anagrams only if the size of group is more than 1
2) Order of words in output should be same as order given in input.
3) Print -1, if no group of anagrams found

*/
import java.util.*;
class AnagramPairs
{
    public static void main(String args[])
    {
        String s;
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        String arr[]=s.split(" ");
        int flag=0;
        int n=arr.length;
        boolean[] done = new boolean[n];
        for(int i=0;i<arr.length;i++)
        {
            List<String> s_list= new ArrayList<String>();
            s_list.add(arr[i]);
                
            for(int j=i+1;j<arr.length;j++)
            {
                if(isAnagram(arr[i],arr[j])==true&&done[j]==false)
                {
                    flag=1;
                    s_list.add(arr[j]);
                    done[j]=true;
        
                    
                }
            }
            if(s_list.size()>1)
                System.out.println(s_list);
        }
        if(flag==0)
        System.out.println(-1);
        
    }
    static public boolean isAnagram(String s1,String s2)
    {
        
        int n=s1.length();
        int i=0;
        String t;
        int flag=0;
        if(s1.length()==s2.length())
            {
                while(i<(n))
            {
                    t=Character.toString(s1.charAt(i));
                
                if(s2.contains(t)==false)
                {
                    return false;
                }
                i++;
            }
            return true;
            }
        else
            return false;   
            
            

}
}
