package files;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class stream2 {

	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);

		FileOutputStream fout = new FileOutputStream("myfile.txt");

		BufferedOutputStream bout = new BufferedOutputStream(fout, 1024);

		System.out.println("Enter text(@ at the end):");

		char ch;

		while ((ch = (char) dis.read()) != '@') {
			bout.write(ch);
		}
		bout.close();

	}
}
