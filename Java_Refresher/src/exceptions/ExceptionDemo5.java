package exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author razaa
 * @category checked exceptions
 */
public class ExceptionDemo5 {
	public static void main(String[] args) {
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block...");
		}

		if (fos != null)
			try {
				fos.write("tata bye bye...".getBytes());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		if (fos != null)
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		if (fos != null)
			System.out.println("success");
		else
			System.out.println("There was some error in creating a file!");
	}
}
//Unhandled exception type FileNotFoundException
//Unhandled exception type IOException
