package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	
	private String color;
	private boolean wireless;
	
	public Cuffie(String nome,String descrizione,double prezzo,int iva,String product,boolean fedelty,String color, boolean wireless) {
		super(nome,descrizione,prezzo,iva,product,fedelty);
		
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
	public double getSconto(){
		double sconto = 0;
		if(isFedelty()) {
			sconto=0.02;
		}
		return sconto;
	}
	public String getPrezzoScontato() {
	    double sconto = getSconto();
	    if (!wireless) {
	        sconto += 0.07;
	    }
	    double scontato = getPrezzoCompleto() * sconto;
	    double prezzoScontato = getPrezzoCompleto()-scontato;
	    return String.format("%.02f", prezzoScontato);
	}
	
	@Override
	public String toString() {
		String wirelessStatus = wireless ? "SI" : "NO";
		return super.toString() + "Colore:" + " " + color + "\n"
								+ "Wireless:" + " " + wirelessStatus + "\n"
								+ "Prezzo Scontao:" + " " + getPrezzoScontato() + "€" + "\n"
								+"--------------------------";
	}
}
