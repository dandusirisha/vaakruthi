package networking;


	import java.net.*;
	import java.io.*;
	import java.util.*;
	public class Details {
		
		public static void main(String args[]) throws Exception
		{
			URL obj = new  URL("https://www.vaakruthi.com/about.html");
			URLConnection conn = obj.openConnection();
			System.out.println("Date:"+new Date(conn.getDate()));
			System.out.println("Content-type:"+conn.getContentType());
			System.out.println("Expires:"+conn.getExpiration());
			System.out.println("Last Modified:"+conn.getLastModified());
			int l = conn.getContentLength();
			if(l==0)
			{
				System.out.println("Content not available");
				return;
			}
			else
			{
				int ch;
				InputStream in = conn.getInputStream();
				
				while((ch = in.read())!=-1)
					System.out.print((char)ch);
			}
		}

	}


