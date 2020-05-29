/**
 * 
 */
package com;

import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author 212720190
 * @date Oct 5, 2018
 */
public class FileCheckSum {

	
	public static void main(String[] args) throws NoSuchAlgorithmException, IOException {

		MessageDigest digest = MessageDigest.getInstance("MD5");
		File file = new File("C://Users//212720190//inputDir//file.txt");
		System.out.println(Integer.MIN_VALUE);

	System.out.println(CheckSumUtil.fileCheckSum(digest, file));
	}

}
