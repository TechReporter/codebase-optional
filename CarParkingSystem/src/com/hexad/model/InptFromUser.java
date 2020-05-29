package com.hexad.model;

import java.util.Scanner;

public class InptFromUser {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		  
        String s = in.nextLine(); 
  
        int a = in.nextInt(); 
        System.out.println("created lot :: "+a); 
  in.close();
	}

}
