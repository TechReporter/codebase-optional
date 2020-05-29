/**
 * 
 */
package factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Mar 17, 2019
 */
public abstract class Website {

	List<Page> pages = new ArrayList<>();
	
	public Website() {
		this.createWebsite();
	}
	
	public abstract void createWebsite();

	public List<Page> getPages() {
		return pages;
	}
	
}
