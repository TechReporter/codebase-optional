package com;


public class Car {
	int id;
	Company cc;
	
	private Car() {
		System.out.println("private");
	}
static Car getP() {
	return new Car();
}
	public Car(int id, Company cc) {
		this.id = id;
		this.cc = cc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Company getCc() {
		return cc;
	}

	public void setCc(Company cc) {
		this.cc = cc;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (cc == null) {
			if (other.cc != null)
				return false;
		} else if (!cc.equals(other.cc))
			return false;
		return true;
	}
	
}
