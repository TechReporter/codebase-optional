/**
 * 
 */
package javaMisc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author 212720190
 * @date Dec 25, 2019
 */
public class FileBasedDataStore {
	//implement a file based key-value data store.that supports the basic CRD (create, read, and delete) 
	//operations. This data store is meant to be used 
	//as a local storage for one single process on one laptop.
	public static void main(String[] args) throws IOException {
		insertData();

	}

	private static void insertData() throws IOException {
		BufferedReader br = null;
		Scanner sc = null;
		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			sc = new Scanner(System.in);

			System.out.println("print name");
			String name = sc.nextLine();

			System.out.println("print place");
			String place = sc.nextLine();

			System.out.println("print occupation");
			String occupation = sc.nextLine();

			System.out.println("print gender");
			String gender = sc.nextLine();
			Map<String, Object> obj = new TreeMap<>();
			obj.put("NAME", name);
			obj.put("PLACE", place);
			obj.put("OCCUPATION", occupation);
			obj.put("GENDER", gender);
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("BR.txt",true)));
			pw.print(obj);
			pw.close();
		} finally {
			br.close();
			sc.close();
		}
	}

}
