/*import java.net.*;
import java.io.*;

public class Echo {
    public static void main(String[] args) throws Exception {
        URL oracle = new URL("http://www.oracle.com/");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}*/
package Chen;
import java.io.*;
import java.net.*;

 class  Rextester{
    public static void main(String[] args) {
    	try {
			echoPrint("http://www.google.com/");
           // echoPrint(args[0]);
		} catch (IOException e) {
			System.err.println("OOPSie: problems reading the file.");
		}
	}
	public static void echoPrint(String filename) throws IOException 
	{	
        
        URL web= new URL(filename);
        URLConnection yc = web.openConnection();
       
        BufferedReader infile = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String in = null;
    	while((in = infile.readLine()) != null) {
			System.out.println(in);
		}
		infile.close();
	}
}
