
package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

/**
 * @author 212720190
 * @date Jan 15, 2019
 */
public class ReadFromFile {

	public static void main(String[] args) {

		String filePath = "src/com/datafile.txt";
		try(BufferedReader bf = new BufferedReader(new FileReader(filePath), 10)) {
			
			String fileData = "";
			StringBuilder strBuilder = new StringBuilder();

			while((fileData = bf.readLine()) != null) {
				strBuilder.append(fileData)
				.append(" = ")
				.append(String.valueOf(calculateExpression(fileData))).append("\r\n");
			}
			dataWrite(strBuilder,filePath);
	
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	static void dataWrite(StringBuilder str, String path) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			bw.write(str.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
	
	static int calculateExpression(String str) {
		Stack<Integer> sValue = new Stack<>();
		
		char[] charData = str.toCharArray();
		
		for(int i = 0; i<charData.length; i++) {
			if(Character.isDigit(charData[i])) {
				sValue.push(charData[i] -'0');
				System.out.println("stack value =="+sValue);
			}
				else if(charData[i] == '+' || charData[i] == '-' ||
						charData[i] == '*' || charData[i] == '/') {
					
					int fValue = sValue.pop();
					int sndValue = sValue.pop();
					
					switch (charData[i]) {
						
					case '+': sValue.push(fValue + sndValue);
					System.out.println("stack value after operand "+charData[i]+" ="+sValue);
						break;
					case '-': sValue.push(sndValue - fValue);
						break;
					case '*': sValue.push(sndValue * fValue);
						break;
					case '/': sValue.push(sndValue / fValue);
						break;
					default:
						break;
					}
				}
			}
		System.out.println("result=="+sValue.peek());
		return sValue.pop();
			
		}

}
