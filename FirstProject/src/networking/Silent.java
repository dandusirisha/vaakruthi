package networking;

import java.net.*;
import java.io.*;

public class Silent {
	
	public static void main(String arsgs[]) throws Exception
	{
		ServerSocket ss = new ServerSocket(777);
		Socket s = ss.accept();
		System.out.println("Connection established....");
		OutputStream obj = s.getOutputStream();
		PrintStream ps = new PrintStream(obj);
		String str = "Hello Client";
		ps.println(str);
		ps.println("Bye");
		ps.close();
		ss.close();
		s.close();
	}

}


