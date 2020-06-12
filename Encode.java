/*
Given an encoded string, return its decoded string.
The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
Examples:
s = "3[a]2[bc]", return "aaabcbc".
s = "3[a2[c]]", return "accaccacc".
s = "2[abc]3[cd]ef", return "abcabccdcdcdef".

*/
import java.util.Scanner;
class Encode
{
    public static void main(String args[])
    {
        String s ;
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        //StringBuilder s=new StringBuilder(sp);
        int i=0,n=0;
        while(i<s.length())
        {
            String x="";
            System.out.println(s+" "+i);
            Character p1=s.charAt(i);
            int p=(int)p1;
            if(p>=48 && p<=57)
            {
                n=(48-p);
                x=p1.toString();
            
            }
            if(p==91)
            {
                System.out.println("hi");
                StringBuilder s2=new StringBuilder("");
                int k=i;
                while(k!=93)
                {
                    s2.append((char)k);
                    k++;
                }
                StringBuilder r=new StringBuilder("");
                for(int j=0;j<n;j++)
                {
                    r.append(s2);   
                }
                r.toString();
                s2.toString();
                //String x=to.String(Character(n));
                s.replaceFirst(x,"");
                s.replaceFirst(s2.toString(),r.toString());
                n=0;
                
            }
            i++;
        }
        
    }
}
