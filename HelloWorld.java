import java.io.*;
import java.util.*;
public final class HelloWorld 
{
	public static void main(String[] args) throws Exception
	{
		PrintWriter writer = new PrintWriter("/data/output/File.txt", "UTF-8");
		writer.println("Hello World!!!");
		writer.close();
		System.out.println("Process completed!");
	}
}