import java.io.*;
import java.util.*;
public final class HelloWorld 
{
	public static void main(String[] args)
	{
		try
		{
		String id = args[0];
		String dir = "/data/output/appresults/" + id + "/folder/";
		String outputFilename = "file.txt"; 
		
		// if the directory does not exist, create it
		File theDir = new File(dir);
		if (!theDir.exists())
		{
			theDir.mkdirs();  
		}

		System.out.println("done");
		PrintWriter writer = new PrintWriter(dir + outputFilename, "UTF-8");
		writer.println("Hello World!!!");
		writer.close();
		System.out.println("Data output to " + dir + outputFilename);
		System.out.println("Process completed!");
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
}