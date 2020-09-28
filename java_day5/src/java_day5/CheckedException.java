//Handling a checked exception by opening a file
//Write a  code opens a text file and writes its content to the standard output. What happens if the file doesn’t exist?
package java_day5;
import java.io.*;
import java.lang.Exception;

public class CheckedException {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\varunpannala\\Downloads\\Day3_Java.doc");
			while (fin.available() > 0) {
				int i = fin.read();
				System.out.print((char) i);
			}

			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	          
}