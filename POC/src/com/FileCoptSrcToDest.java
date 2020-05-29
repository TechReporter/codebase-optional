/**
 * 
 */
package com;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author 212720190
 * @date Oct 11, 2018
 */
public class FileCoptSrcToDest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException, UnsupportedOperationException {

		//copyFileUsingStream(new File("C:\\Users\\212720190\\inputDir\\data.txt"), new File("C:\\Users\\212720190\\outputDir\\file.txt"));

       
        /*File file = new File("C:\\Users\\212720190\\inputDir\\data.txt"); 
        
        // renaming the file and moving it to a new location 
        if(file.renameTo 
           (new File("C:\\Users\\212720190\\outputDir1\\data.txt"))) 
        { 
            // if file copied successfully then delete the original file 
            System.out.println("File moved successfully"); 
        } 
        else
        { 
            System.out.println("Failed to move the file"); 
        } */
		
		try {
			Files.move(Paths.get("C:\\Users\\212720190\\inputDir\\data.txt"), 
					Paths.get("C:\\Users\\212720190\\outputDir1\\data.txt"));

		}
		catch (UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		}
		
		
        
	}
		
		
		
		
	/*private static void copyFileUsingStream(File source, File dest) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}
*/
}
