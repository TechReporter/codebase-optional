/**
 * 
 */
package excelUtil;

/**
 * @author 212720190
 * @date Mar 31, 2019
 */
public class PermAddress extends TempAddress {

	private String area;

	public PermAddress(String flat, String road, String area) {
		super(flat, road);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
}
