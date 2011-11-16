/* Team Eupraxia: 
 * Alexander Clucas
 * James Cunningham
 * Christopher Fenrick
 * Justin Field
 * Jason Peinkofer
 * David Taylor
 * Marcos Zavala
 * 
 * CS361 - Fall 2011
 * Sensor-based smart vehicle Simulation
 *
 * server.java
 * the server is responsible for reading the 361projectinput and initializing the virtual HWY
 * 
 *
 */
 
import java.io.*;
import java.util.*;

public class server {

    /**
	 * requires a file in its root directory called 361project.in
	 * this server parses the file for the data it needs to generate the virtual HWY.
	 * this server will also generate a file called 362project.out
	 * !!!! please note !!!! if the file already exists it will delete it without asking!
	 */
    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedWriter fOut; // the object to be used to write to the 361project.out file
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("                            Opening File 361project.in");

		// open the 372project input file so it can be parsed for data
		try{
			// Open the file
			FileInputStream fstream = new FileInputStream("361project.in");

			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;

			// loop through the file line by line and add data to array
			while ((strLine = br.readLine()) != null){
				projectInput.add(strLine);
			}
			//Close the input stream
			in.close();
		}
		catch (Exception ex){//Catch exception if any
			System.err.println("Error: " + ex.getMessage());
		}

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("               parsing input file for data and creating virtual HWY");
        
        String str = projectInput.get(0);
		String[] data = str.split(" ");
    }
}