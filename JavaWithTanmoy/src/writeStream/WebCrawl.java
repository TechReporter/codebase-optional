/**
 * 
 */
package writeStream;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

class WebCrawl {

	public static void main(String[] args) {

		List<String> listUrl = Arrays.asList("https://dzone.com/articles/custom-collectors-in-java-8");
		
		new WebCrawl().buildUrl(listUrl);
	}

	private void buildUrl(List<String> url) {
		url.stream()
           .map(ThrowingFunction.uncheckedFunc(e -> new URL(e)))
           .forEach(ThrwoingConsumer.uncheckedFunc(e -> saveContent(e)));
	}
	
	private void saveContent(URL url) throws IOException{
			String uuid = UUID.randomUUID().toString();
	        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
	        
	        InputStream inputStream = conn.getInputStream();
	        Files.copy(inputStream, Paths.get(uuid + ".txt"), StandardCopyOption.REPLACE_EXISTING);    
	}	
	
}
