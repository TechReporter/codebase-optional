/**
 * 
 */
package javaMisc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author 212720190
 * @date Oct 11, 2019
 */
public class SaveImageFromUrl {

public static void main(String[] args) throws Exception {
	
	String str = "57468554-AEE5-4C0E-9332-26E1DBAF84F3 | 56EB77A9-D59D-42C1-9D6A-929C4D5B2BC6";
	String[] str1 = str.split(" \\| ");
	System.out.println(Arrays.toString(str1));
	
	
	
	/*
	
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
	Date date = new Date();
	String sysDate = dateFormat.format(date);
	getStringToDateAsGivenFormat(sysDate,"MM/dd/yyyy hh:mm:ss");
	
	
	
	String id = "{2324343}";
	System.out.println(id);
	id = id.replaceAll("[{}]", " ").trim();
	System.out.println(id);
	
	
    String imageUrl = "http://www.avajava.com/images/avajavalogo.jpg";
    String destinationFile = "avajavalogo.jpg";

    saveImage(imageUrl, destinationFile);
*/}

public static Date getStringToDateAsGivenFormat(String date,String pattern) {
	if (null != date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			System.out.println(sdf.parse(date));
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	return null;
}

public static void saveImage(String imageUrl, String destinationFile) throws IOException {
    URL url = new URL(imageUrl);
    InputStream is = url.openStream();
    OutputStream os = new FileOutputStream(destinationFile);

    byte[] b = new byte[2048];
    int length;

    while ((length = is.read(b)) != -1) {
        os.write(b, 0, length);
    }

    is.close();
    os.close();
}

}
