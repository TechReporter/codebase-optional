/**
 * 
 */
package matrixPrlbs;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 212720190
 * @date Mar 11, 2019
 */
public class jsonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<Long> set = new HashSet<Long>();
		set.add(123L);
		set.add(345L);
		set.add(343434L);
		set.add(43434L);

		System.out.println(new jsonTest().getBulkWorkorderPayload(set));
	}

	

    private String getBulkWorkorderPayload(Set<Long> workorderIds) {
        StringBuilder json = new StringBuilder();
        json.append("{\"workorderIds\":[");
            workorderIds.forEach(entry -> json.append( entry
                    + ","));
            json.replace(json.lastIndexOf(","), json.length(), "]}");
        return json.toString();
    }
}
