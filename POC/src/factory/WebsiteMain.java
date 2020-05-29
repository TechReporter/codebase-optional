/**
 * 
 */
package factory;

/**
 * @author 212720190
 * @date Mar 18, 2019
 */
public class WebsiteMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Website blogSite = WebsiteFactory.getWebsite(SiteType.BLOG.getSiteType());
		System.out.println(blogSite.getPages());
		
		Website shopSite = WebsiteFactory.getWebsite(SiteType.SHOP.getSiteType());
		System.out.println(shopSite.getPages());
	}

}
