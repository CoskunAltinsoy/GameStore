package Entities;

public class Campaign {
	private int id;
	private String name;
	private double price;
	private double discount;
	
	
	public Campaign() {
		
	}

	public Campaign(int id, String name, double discount,double price) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public double priceAfterDiscount() {
		return price - (this.price * this.discount/100);
	}

}
