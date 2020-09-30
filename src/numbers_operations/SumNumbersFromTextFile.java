package numbers_operations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumNumbersFromTextFile {
	
/*
 * Get total of all numbers read from a text file
 */
	public static void main (String[] args) throws FileNotFoundException {
		
		/*
		 * create an object to hold the file
		 */
		File file = new File("src/sampleText.txt");
		
		//Object used to prepare file for reading
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		
		//Keep track of current line 
		String st;
		
		Integer sumOfTextNumbers = 0;
		
		try {
			//go through each line of the file and total up the numbers
			while((st=br.readLine()) != null) {
				sumOfTextNumbers += Integer.parseInt(st);
				System.out.println(st); // printing each line read from the file 
			}
			System.out.println("The sum of all numbers in the text file is : "+sumOfTextNumbers);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
