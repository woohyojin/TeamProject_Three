package com.example.othercock.DTO;

public class OrderMenu {
	private String name;
	private String index;
	private int price;
	private int kcal;
	private String allregy;
	private int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	public String getAllregy() {
		return allregy;
	}
	public void setAllregy(String allregy) {
		this.allregy = allregy;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "[" + name + "-" + index + "-" + price + "-" + kcal + "-"
				+ allregy + "-" + number;
	}
	
}
