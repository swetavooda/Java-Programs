/*Write a java program to open a file find the string ";"(semicolon) in a given file 
and replace with " "(space) 


Note:to write a data to a file use RandomAccessFile and file name sholud be "sample.txt"

Contentent in a file(sample.txt) :
hi;hello;how;are;you

Sample Test Case:
hi hello how are you

*/
import java.io.*;
class Test

{
    public static void main(String args[])throws IOException
    {
        RandomAccessFile r = new RandomAccessFile("sample.txt","rw");
        r.seek(0);
        //System.out.println((char)r.read());
        //System.out.println(r.getFilePointer());//after seek it increments
        char c=';';
        String p=" ";
        int b=0;
        while(b<r.length())
        {
            
            if(c==(char)r.read())
            {
                r.seek(b);
                r.write(p.getBytes());
            }
            b++;

        }
        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line;
        while ((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
        
        
    }
}