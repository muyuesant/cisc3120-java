package Chen;

import java.io.*;

import java.io.*;
public class Driver {
	public static void main(String[] args) {
		try {
			printWhen(args[0]);
		} catch (IOException e) {
			System.err.println("OOPSie: problems reading the file.");
		}
	}
	public static void printWhen(String filename) throws IOException 
	{	
		FileInputStream in0 = new FileInputStream(new File(filename));
		InputStreamReader in1 = new InputStreamReader(in0);
		BufferedReader infile = new BufferedReader(in1);		
		String buffer = null;
		while((buffer = infile.readLine()) != null) {							// read in a line of text
			System.out.println(buffer);
		}
		infile.close();
	}
}
