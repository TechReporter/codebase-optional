/**
 * 
 */
package factory;

/**
 * @author 212720190
 * @date Mar 18, 2019
 */
public enum SiteType {

	BLOG("blog"), SHOP("shop");
	
	private String siteType;
	
	private SiteType(String val) {
		this.siteType = val;
	}

	public String getSiteType() {
		return siteType;
	}
}
