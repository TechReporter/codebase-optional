package com.model;

/**
 * @author 212720190
 * @date Mar 12, 2019
 */
public class IncomeDetails {

	private String city;
	private String country;
	private Gender gender;
	private String currency;
	private Double avgIncome;
	
	public IncomeDetails() {
		
	}
	public IncomeDetails(String city, String country, Gender gender, String currency, Double avgIncome) {
		super();
		this.city = city;
		this.country = country;
		this.gender = gender;
		this.currency = currency;
		this.avgIncome = avgIncome;
	}
	
	class IncomeValueResult {
		private String iCountry;
		private String iCurrency;
		private String iAvgIncome;
		
		public IncomeValueResult() {
			super();
			this.iCountry = country;
			this.iCurrency = currency;
			this.iAvgIncome = String.valueOf(avgIncome);
		}

		public String getiCountry() {
			return iCountry;
		}

		public void setiCountry(String iCountry) {
			this.iCountry = iCountry;
		}

		public String getiCurrency() {
			return iCurrency;
		}

		public void setiCurrency(String iCurrency) {
			this.iCurrency = iCurrency;
		}

		public String getiAvgIncome() {
			return iAvgIncome;
		}

		public void setiAvgIncome(String iAvgIncome) {
			this.iAvgIncome = iAvgIncome;
		}

		@Override
		public String toString() {
			return "IncomeValueResult [iCountry=" + iCountry + ", iCurrency=" + iCurrency + ", iAvgIncome=" + iAvgIncome
					+ "]";
		}
		
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getAvgIncome() {
		return avgIncome;
	}
	public void setAvgIncome(Double avgIncome) {
		this.avgIncome = avgIncome;
	}

	@Override
	public String toString() {
		return "IncomeDetails [city=" + city + ", country=" + country + ", gender=" + gender + ", currency=" + currency
				+ ", avgIncome=" + avgIncome + "]";
	}
	
}
