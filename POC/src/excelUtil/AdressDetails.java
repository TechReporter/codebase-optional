/**
 * 
 */
package excelUtil;

import java.util.List;

/**
 * @author 212720190
 * @date Mar 30, 2019
 */
public class AdressDetails {

	private String permName;
	private String tempName;
	private List<PermAddress> permAddress;
	private List<TempAddress> tempAddress;
	
	public AdressDetails(String permName,String tempName, List<PermAddress> permAddress, List<TempAddress> tempAddress) {
		super();
		this.permName = permName;
		this.tempName = tempName;
		this.permAddress = permAddress;
		this.tempAddress = tempAddress;
	}
	
	public String getPermName() {
		return permName;
	}

	public void setPermName(String permName) {
		this.permName = permName;
	}

	public String getTempName() {
		return tempName;
	}

	public void setTempName(String tempName) {
		this.tempName = tempName;
	}


	public List<PermAddress> getPermAddress() {
		return permAddress;
	}
	public void setPermAddress(List<PermAddress> permAddress) {
		this.permAddress = permAddress;
	}
	public List<TempAddress> getTempAddress() {
		return tempAddress;
	}
	public void setTempAddress(List<TempAddress> tempAddress) {
		this.tempAddress = tempAddress;
	}
}
