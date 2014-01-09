import java.io.*;
import java.util.*;
public final class HelloWorld 
{
	public static void main(String[] args)
	{
		try
		{
		String id = args[0];
		double numA = Double.parseDouble(args[1]);
		double numB = Double.parseDouble(args[2]);
		String dir = "/data/output/appresults/" + id + "/folder/";
		String outputFilename = "result.txt"; 
		
		// if the directory does not exist, create it
		File theDir = new File(dir);
		if (!theDir.exists())
		{
			theDir.mkdirs();  
		}
		System.out.println("Application begin!");
		PrintWriter writer = new PrintWriter(dir + outputFilename, "UTF-8");
		writer.println("The multiplication of " + numA + " and " + numB + " = " + numA * numB);
		writer.close();
		System.out.println("Application end!");
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
}