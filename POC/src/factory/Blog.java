/**
 * 
 */
package factory;

/**
 * @author 212720190
 * @date Mar 17, 2019
 */
public class Blog extends Website {

	@Override
	public void createWebsite() {
		
		pages.add(new CommentPage());
		pages.add(new ContactPage());
		pages.add(new AboutPage());
		pages.add(new PostPage());

	}

}
