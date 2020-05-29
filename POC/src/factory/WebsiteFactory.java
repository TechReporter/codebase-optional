/**
 * 
 */
package factory;

/**
 * @author 212720190
 * @date Mar 18, 2019
 */
public class WebsiteFactory {

	public static Website getWebsite(String siteType) {
		switch (siteType) {
		case "blog":
		return new Blog();

		case "shop":
			return new Shop();
			
			default:
				return null;
		}
	}
}
