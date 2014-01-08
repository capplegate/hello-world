import java.io.*;
import java.util.*;
public final class HelloWorld 
{
	public static void main(String[] args) throws Exception
	{
		String id = args[0];
		String outputFile= "/data/output/" + id + "/file.txt"; 
		PrintWriter writer = new PrintWriter(outputFile, "UTF-8");
		writer.println("Hello World!!!");
		writer.close();
		System.out.println("Data output to " + outputFile);
		System.out.println("Process completed!");
	}
}