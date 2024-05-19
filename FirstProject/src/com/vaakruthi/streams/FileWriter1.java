package com.vaakruthi.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriter1 {

	public static void main(String [] args) throws IOException {
		String[] names = { "kumar", "naga" };
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("secondfile.txt"));
			bw.write("hello");
			for (String name : names) {
				bw.write("\n" + name);
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader("secondfile.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
