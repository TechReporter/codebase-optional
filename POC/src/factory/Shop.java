/**
 * 
 */
package factory;

/**
 * @author 212720190
 * @date Mar 17, 2019
 */
public class Shop extends Website {

	@Override
	public void createWebsite() {

		pages.add(new ItemPage());
		pages.add(new CartPage());
		pages.add(new CatalogPage());
		pages.add(new ContactPage());
		pages.add(new AboutPage());

	}

}
