package Automation;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class CSVFile {

	public static void main(String[] args) throws IOException {

		//initializing the CSVwriter class
		
		CSVWriter write = new CSVWriter(new FileWriter ("testdata//sample1.csv"));
		
		// Write Data into csv file
		
		String set1[]= {"name"};
		String set2[]= {"Vikas Pawar"};
		
		write.writeNext(set1);
		write.writeNext(set2);
		
		// flush data to create CSV file data
		
		write.flush();
		
		System.out.println("Data entered");


	}

}
