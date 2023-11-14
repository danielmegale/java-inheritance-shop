package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	
	private String color;
	private boolean wireless;
	
	public Cuffie(String nome,String descrizione,double prezzo,int iva,String product,String color, boolean wireless) {
		super(nome,descrizione,prezzo,iva,product);
		
		setColor(color);
		setWireless(wireless);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		String wirelessStatus = wireless ? "SI" : "NO";
		return super.toString() + "Colore:" + " " + color + "\n"
								+ "Wireless:" + " " + wirelessStatus + "\n"
								+"--------------------------";
	}
}
