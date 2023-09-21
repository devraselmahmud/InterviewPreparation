package exception_handling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileNotFoundEx {

	public static void main(String[] args) {

		PrintWriter out;

		try {

			out = new PrintWriter("file.txt");
			out.println("saved");

		} catch (FileNotFoundException e) {

			//throwing exception
			System.out.println(e.getMessage());
		}

		System.out.println("File saved successfully");
	}
}
