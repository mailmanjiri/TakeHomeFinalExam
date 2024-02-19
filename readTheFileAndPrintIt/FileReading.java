package readTheFileAndPrintIt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
	static Scanner scanner;
	static String path= "src\\config\\config2.txt";

	public static void main(String[] args) {
		
		
		try {
			readAndPrintwords();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	    }
	
	public static void readAndPrintwords() throws FileNotFoundException {
		File file= new File(path);
		scanner= new Scanner(file);
		
		String [] lineArr= null;
		String []linearrSplit= null;
		
		while((scanner.hasNext())) {
			lineArr= scanner.nextLine().split("-");
			
			System.out.println(lineArr[0]);
		    
			linearrSplit= lineArr[lineArr.length-1].split(",");
			System.out.println(linearrSplit[0]);
		    String lastline=linearrSplit[linearrSplit.length-1];
		    System.out.println(lastline);
		
		}
		
	}

}

