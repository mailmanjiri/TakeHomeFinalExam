package fileExistOrNot;

import java.io.File;
import java.io.FileNotFoundException;

public class FindfFile {

	public static void main(String[] args) {
		
    try {
		doesFileExist("src/config/config2.properties");
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	}
	
	public static void doesFileExist(String path) throws FileNotFoundException {
		File file= new File(path);
		boolean exists=file.exists();
		
		if(exists) {
			System.out.println("The file exist at specified path");
		}else {
		   
			System.out.println("The file does not exist");
			  throw new FileNotFoundException();
			 
		}
		
	}

}
