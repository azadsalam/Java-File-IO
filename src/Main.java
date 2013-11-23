import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FileIO.init("input.txt","output.txt");
		Scanner input = FileIO.getInput();
		PrintWriter output = FileIO.getOutput();
		
		while(input.hasNext())
		{
			String line = input.nextLine();
			output.println(line);
			output.flush();
			System.out.println(line);
		}
		output.close();
	}
	
	

}

class FileIO
{
	static Scanner input;
	static PrintWriter output;
	static File in,out;
	public static void init(String inputFileName, String outputFileName) 
	{
		// TODO Auto-generated constructor stub
		in = new File(inputFileName);
		out = new File(outputFileName);
		
		try 
		{
			input = new Scanner(in);
			output = new PrintWriter(out);

		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Scanner getInput() {
		return input;
	}
	public static PrintWriter getOutput() {
		return output;
	}
	
	public static void closeFiles() {
	
	}
	

}
