/* Given 3 strings s1,s2,s3 .find an output string "output" such that s3 is a substring 
of string s1+output+s2,print the minimum possible length of s1+output+s2...
Example:
s1=abcd
s2=efgh
s3=dme
output=m
ans=9
.....
output=
abcd                                                                                                                    
efgh                                                                                                                    
dme                                                                                                                     
output string= 'm'                                                                                                      
length= 9
*/

import java.util.*;
class Seq_Test { 
	
	// Returns true if s1 is substring of s2 
	static void outputString(String s1, String s2, String s3) 
	{ 
		//check s3 is a substring of s1 or s2
		if((s1+s2).indexOf(s3)>=0)
		{
		    System.out.println("output string= ''");
	        System.out.println("length= "+(s1+s2).length());
	        System.exit(0);
		}
		int sl1 = s1.length();
		int sl3 = s3.length(); 
		int index1,index2;
		int i=0,index=Math.min(sl1,sl3);
		String output="";
		
		//check substring in string1 from starting
		while(true)
		{
		    if(i==index){
		        i=0;
		        break;
		    }
		    else if((s1.substring(sl1-++i)).equals(s3.substring(0,i)))
		        break;
		    else
		        i++;
		}
		index1=i;
		
		//check substring in string2 from index2
		while(true)
		{
		    if(s2.indexOf(s3.substring(i,sl3))==0)
		        break;
		    else
		        i++;
		}
		index2=i;
	    //System.out.println(index1+" "+index2);
	    output= s3.substring(index1,index2);
	    System.out.println("output string= '"+output+"'");
	    System.out.println("length= "+(s1+output+s2).length());
	}
	/* Driver program to test above function */
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		outputString(s1,s2,s3); 
		
	}
}
