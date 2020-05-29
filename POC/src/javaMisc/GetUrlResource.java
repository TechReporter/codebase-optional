/**
 * 
 */
package javaMisc;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author 212720190
 * @date Dec 13, 2019
 */
public class GetUrlResource {

	public static void main(String[] args) throws URISyntaxException, IOException {
        ObjectMapper mapper = new ObjectMapper();
		String str = "/{BD620001-DF8D-4FC0-AB90-3AC089F56E37}?lang=en";
        str = str.replaceAll("[{}]", "");
		URI uri = new URI(str);
        String itemId = uri.getPath();
        List<NameValuePair> queryParameters = URLEncodedUtils.parse(uri, Charset.forName("UTF-8"));
        JsonNode node = mapper.readTree("{\r\n" + 
        		"    \"serviceOrgDetails\": [\r\n" + 
        		"        {\r\n" + 
        		"            \"orgId\": 3114,\r\n" + 
        		"            \"orgName\": \"AAD - Aurizon Australia Distribution\",\r\n" + 
        		"            \"orgCode\": \"AAD\"\r\n" + 
        		"        },\r\n" + 
        		"        {\r\n" + 
        		"            \"orgId\": 2935,\r\n" + 
        		"            \"orgName\": \"Aenergia Luanda Warranty\",\r\n" + 
        		"            \"orgCode\": \"AWD\"\r\n" + 
        		"        },\r\n" + 
        		"        {\r\n" + 
        		"            \"orgId\": 972,\r\n" + 
        		"            \"orgName\": \"Aktobe CSC\",\r\n" + 
        		"            \"orgCode\": \"KAK\"\r\n" + 
        		"        }]}");
        		
        convertJsonToMap(node);
	}
	
	static void convertJsonToMap(JsonNode value) {
		
        ObjectMapper mapper = new ObjectMapper();
       Map<String, Object> map = mapper.convertValue(value, Map.class);

		
	}

	/**
	 * @param value
	 * @param class1
	 */
	private static void convertValue(JsonNode value, Class<Map> class1) {
		// TODO Auto-generated method stub
		
	}

}
