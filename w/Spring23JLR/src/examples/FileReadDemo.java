package examples;
import java.util.Scanner; // Needed for the Scanner
import java.io.*;         // Needed for the File and IOException

/**
 *  This program reads data from a file.
 */

public class FileReadDemo
{
   public static void main(String[] args) throws IOException
   {
	   Scanner keyboard = new Scanner(System.in);
	   String filename;
	   System.out.print("Enter the filename: ");
	   filename = keyboard.readString();
	   PrintWriter outFile = new PrintWriter(filename);
   }
}
