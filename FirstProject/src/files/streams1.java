package files;

import java.io.*;
public class streams1 {
	public static void main(String[] args) throws IOException
	{
		DataInputStream dis = new DataInputStream(System.in);
		
		FileOutputStream fout = new FileOutputStream("myfile.txt");
		
		System.out.println("Enter text(@ at the end):");
		
		char ch;
		
		while((ch=(char)dis.read())!='@')
		{
			fout.write(ch);
		}
		fout.close();
	}
}