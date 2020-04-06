/*
text.txt
---------
hello, this is the answer to the 5th question in java assignment.
This code will return the content of file if the given word exists.
input = content
output = 
Found key
The contents of file are:
hello, this is the answer to the 5th question in java assignment.
This code will return the content of file if the given word exists.
input = hi
hi
Key not found
*/

import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.*;
public class StrTokenizer 
{
 	
	public static void main(String[] args)
	{
		String line=" ";
		int lineNo;
		Scanner sc = new Scanner(System.in);
        String find= sc.nextLine();
        int flag=0;
		try
		{
			FileReader fr = new FileReader("text.txt");
            BufferedReader br=new BufferedReader(fr);
        	line = br.readLine();
            while(line!=null)
            {
                StringTokenizer st = new StringTokenizer(line," .!,");
				while(st.hasMoreTokens())
				{
					String s=st.nextToken();                    
                    if (s.equals(find))
                    {
                        System.out.println("Found key");
                        System.out.println("The contents of file are: ");
                        flag=1;
                        break;
                    }
				}
				if(flag==1)
                {
                    Scanner input = new Scanner(new File("text.txt"));
                    while (input.hasNextLine())
                    {
                        System.out.println(input.nextLine());
                    }
                    break;
                }
				line=br.readLine();
				
            }
            if(flag==0)
                System.out.println("Key not found");
				
        }			
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
    
}
