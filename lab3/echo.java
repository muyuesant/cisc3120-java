package Chen;

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
			/*StringTokenizer words = new StringTokenizer(buffer);				// chop it up into words
			while( words.hasMoreTokens() ) {									// test each word
				String word = words.nextToken();
					System.out.println(word);
				
			}*/
			System.out.println(buffer);
		}
		infile.close();
	}
}
