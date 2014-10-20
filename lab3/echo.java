package Chen;

import java.io.*;

public class Echo {
	public static void main(String[] args) {
		try {
			echoPrint(args[0]);
		} catch (IOException e) {
			System.err.println("OOPSie: problems reading the file.");
		}
	}
	public static void echoPrint(String filename) throws IOException 
	{	
		FileInputStream in0 = new FileInputStream(new File(filename));
		InputStreamReader in1 = new InputStreamReader(in0);
		BufferedReader infile = new BufferedReader(in1);		
		String buffer = null;
		while((buffer = infile.readLine()) != null) {							// read in a line of text
			System.out.println(buffer);
		}
		infile.close();
		in1.close();?
		in0.close();?
	}
}
