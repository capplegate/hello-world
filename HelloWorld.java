import java.io.*;
import java.util.*;
public final class HelloWorld 
{
	public static void main(String[] args)
	{
		try
		{String id = args[0];
		String dir = args[1];
		String outputDir = dir + id + "/";
		String outputFilename = "file.txt"; 
		
		// if the directory does not exist, create it
		File theDir = new File(outputDir);
		if (!theDir.exists())
		{
			theDir.mkdirs();  
		}

		System.out.println("done");
		PrintWriter writer = new PrintWriter(outputDir + outputFilename, "UTF-8");
		writer.println("Hello World!!!");
		writer.close();
		System.out.println("Data output to " + outputFilename);
		System.out.println("Process completed!");
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
	}
}