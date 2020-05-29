/**
 * 
 */
package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

/**
 * @author 212720190
 * @date Oct 5, 2018
 */
public class CheckSumUtil {

	public static String fileCheckSum(MessageDigest msg, File file) throws IOException {
	    FileInputStream fis = new FileInputStream(file);
	    
	    byte[] byteArr = new byte[1024];
	    
	    int bytesCount = 0;
	      
	    //Read file data and update in message digest
	    while ((bytesCount = fis.read(byteArr)) != -1) {
	        msg.update(byteArr, 0, bytesCount);
	    };
	     
	    //close the stream; We don't need it now.
	    fis.close();
	     
	    //Get the hash's bytes
	    byte[] bytes = msg.digest();
	     
	    //This bytes[] has bytes in decimal format;
	    //Convert it to hexadecimal format
	    StringBuilder sb = new StringBuilder();
	    for(int i=0; i< bytes.length ;i++)
	    {
	        sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
	    }
	     
	    return sb.toString();
	}
}
