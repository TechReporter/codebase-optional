/**
 * 
 */
package leetcode;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 212720190
 * @date Apr 5, 2020
 */
class UndergroundSystem {

    List<User> userList;

	class User {
		int id;
		String checkIn;
		String checkout;
		int checkInTime;
		int checkoutTime;

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCheckIn() {
			return checkIn;
		}
		public void setCheckIn(String checkIn) {
			this.checkIn = checkIn;
		}
		public String getCheckout() {
			return checkout;
		}
		public void setCheckout(String checkout) {
			this.checkout = checkout;
		}
		public int getCheckInTime() {
			return checkInTime;
		}
		public void setCheckInTime(int checkInTime) {
			this.checkInTime = checkInTime;
		}
		public int getCheckoutTime() {
			return checkoutTime;
		}
		public void setCheckoutTime(int checkoutTime) {
			this.checkoutTime = checkoutTime;
		}

	}
    public UndergroundSystem() {
        userList = new ArrayList<>();
    }

	public void checkIn(int id, String stationName, int t) {
		User user = new User();
		user.setCheckIn(stationName);
		user.setId(id);
		user.setCheckInTime(t);
		userList.add(user);

	}

	public void checkOut(int id, String stationName, int t) {
		for(User user : userList) {
			if(user.getId()==id) {
				user.setCheckout(stationName);
				user.setCheckoutTime(t);
			}
		}
	}

	public double getAverageTime(String startStation, String endStation) {
		double avgTime=0.0;
		int count=0;
		double totalTime=0.0;
		for(User user : userList) {
			if(startStation.equals(user.getCheckIn()) && endStation.equals(user.getCheckout())) {
				totalTime+=user.getCheckoutTime()-user.getCheckInTime();
				count++;
			}
		}
		avgTime=totalTime/count;
		DecimalFormat df = new DecimalFormat("#.#####");
		return Double.valueOf(df.format(avgTime));
	}

	public static void main(String[] args) {
		UndergroundSystem undergroundSystem = new UndergroundSystem();
		undergroundSystem.checkIn(10, "Leyton", 3);
		undergroundSystem.checkOut(10, "Paradise", 8);
		System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise")); // return 5.00000
		undergroundSystem.checkIn(5, "Leyton", 10);
		undergroundSystem.checkOut(5, "Paradise", 16);
		System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise")); // return 5.50000
		undergroundSystem.checkIn(2, "Leyton", 21);
		undergroundSystem.checkOut(2, "Paradise", 30);
		System.out.println(undergroundSystem.getAverageTime("Leyton", "Paradise")); // return 6.66667
	}
}
