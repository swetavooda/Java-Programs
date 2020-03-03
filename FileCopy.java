/* Program to copy a src file to destination. 
The name of the src file is Cinderella.txt
Correct the errors in the program
*/

import java.io.*; 
class FileCopy
{ 
	public static void main(String args[]) 
	throws FileNotFoundException,IOException 
	{ 
	    File f = new File("Cinderella.txt");
		/* If file doesnot exist FileInputStream throws 
		FileNotFoundException and read() write() throws 
		IOException if I/O error occurs */
		FileInputStream fis = new FileInputStream(f); 

        File f2 = new File("CopyCinderella.txt");
		/* assuming that the file exists and need not to be 
		checked */
		FileOutputStream fos = new FileOutputStream(f2); 

		int b = fis.read(); 
		System.out.println(f.exists());
		while (b != -1)
		{
		    /*FileOutputStream is used to write on the new file.Even if we dont call
		    createNewFile(), fos would create a new txt file */
		    fos.write(b);
		 System.out.print((char)b);
		 
		 /* read() will readonly next int so we used while 
		loop here in order to read upto end of file and 
		keep writing the read int into dest file */
		    b=fis.read();
		    
		}
			 

	
		fis.close(); 
		fos.close(); 
	} 
} 
