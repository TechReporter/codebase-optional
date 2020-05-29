/**
 * 
 */
package systemdesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//design a in memory file system
//with ls, mkdir, addContent, readContent operation
public class FileSystem {

	static class File {
		Map<String, File> files = new HashMap<>();
		boolean isFile;
		String fileContent = "";

		public String addContent(String content) {
			return this.fileContent = this.fileContent+content;
		}
		
		public String getContent(File file) {
			return file.fileContent;
		}
	}
	File root;
	public FileSystem() {
		root = new File();
	}

	public List < String > ls(String path) {
		File t = root;
		List < String > files = new ArrayList < > ();
		if (!path.equals("/")) {
			String[] d = path.split("/");
			for (int i = 1; i < d.length; i++) {
				t = t.files.get(d[i]);
			}
			if (t.isFile) {
				files.add(d[d.length - 1]);
				return files;
			}
		}
		List < String > res_files = new ArrayList < > (t.files.keySet());
		Collections.sort(res_files);
		return res_files;
	}


	public void mkdir(String path) {
		File t = root;
		if(!path.equals("/")) {
			String[] d = path.split("/");
			for (int i = 1; i < d.length; i++) {
				if(!t.files.containsKey(d[i])) {
					t.files.put(d[i], new File());
				}
				t = t.files.get(d[i]);
			}
		}
	}

	 public String addContentToFile(String filePath, String content) {
	        File t = root;
	        String[] d = filePath.split("/");
	        for (int i = 1; i < d.length - 1; i++) {
	            t = t.files.get(d[i]);
	        }
	        if (!t.files.containsKey(d[d.length - 1]))
	            t.files.put(d[d.length - 1], new File());
	        t = t.files.get(d[d.length - 1]);
	        t.isFile = true;
	        t.addContent(content);
	        return "Content added to file = "+d[d.length - 1];
	    }

	 public String readContentFromFile(String filePath) {
			File t = root;
			String content = "";
			String[] d = filePath.split("/");
			for (int i = 1; i < d.length-1; i++) {
				t = t.files.get(d[i]);
			}
			if(t.files.containsKey(d[d.length-1]) && t.files.get(d[d.length-1]).isFile) {
				content = t.getContent(t.files.get(d[d.length-1]));
			}
			return content;
		}

	public static void main(String[] args) {
			 FileSystem obj = new FileSystem();
			 List<String> param_1 = obj.ls("/");
			 obj.mkdir("/a/b/c");
			 List<String> param_2 = obj.ls("/");
			 String param_3 = obj.addContentToFile("/a/b/c/d","hello");
			 String param_4 = obj.readContentFromFile("/a/b/c/d");
			 
			 System.out.println("ls "+param_1);
			 System.out.println("ls :: "+param_2);
			 System.out.println(param_3);
			 System.out.println("content :: "+param_4);

	}
	
}
