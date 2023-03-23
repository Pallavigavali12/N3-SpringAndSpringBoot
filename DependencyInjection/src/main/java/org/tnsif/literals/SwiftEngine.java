package org.tnsif.literals;

public class SwiftEngine implements IEngine{
	private String Company;
	private double cost;
	
	
	//dependency injection using setters
	public double cost() {
		// TODO Auto-generated method stub
		return cost;
	}
	public String display() {
		// TODO Auto-generated method stub
		return "Japan";
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
//	DI using constructors
	public SwiftEngine(String company, double cost) {
		super();
		Company = company;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return fuel+" "+Company;
	}
	


	

}
