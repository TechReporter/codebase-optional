package systemdesign;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 212720190
 * @date Feb 13, 2020
 */
public class DuplicateInFileSystem {
//["root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"]
	//Output:   [["root/a/2.txt","root/c/d/4.txt","root/4.txt"],["root/a/1.txt","root/c/3.txt"]]
	public static void main(String[] args) {

		String[] path = {"root/a 1.txt(abcd) 2.txt(efsfgh)","root/c 3.txt(abdfcd)","root/c/d 4.txt(efggdfh)"};
		
		findDuplicate(path);
	
	}
	
	static List<List<String>> findDuplicate(String[] path) {
		List<List<String>> list = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		
		for(String p : path) {
			String[] filePaths = p.split(" ");
			for(int i=1; i<filePaths.length;i++) {
				String[] fileContent = filePaths[i].split("\\(");
				String content = fileContent[1].substring(0, fileContent[1].indexOf(')'));
				if(!map.containsKey(content)) {
					map.put(content, new ArrayList<>());
				}
				String pathContent = filePaths[0]+'/'+fileContent[0];
				map.get(content).add(pathContent);
			}
		}
		
		for(Map.Entry<String, List<String>> mm : map.entrySet()) {
			if(mm.getValue().size()>1)
			list.add(mm.getValue());
		}
		return list;
	}

}
