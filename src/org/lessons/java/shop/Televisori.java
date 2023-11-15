package org.lessons.java.shop;

public class Televisori extends Prodotto {
	
	private int dimensioni;
	private boolean smart;
	
	public Televisori(String nome,String descrizione,double prezzo,int iva,String product,boolean fedelty,int dimensioni,boolean smart) {
		super(nome,descrizione,prezzo,iva,product,fedelty);
		
		setDimensioni(dimensioni);
		setSmart(smart);
	}
	
	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
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
	    if (!smart) {
	        sconto += 0.10;
	    }
	    double scontato = getPrezzoCompleto() * sconto;
	    double prezzoScontato = getPrezzoCompleto()-scontato;
	    return String.format("%.02f", prezzoScontato);
	}
	
	@Override
	public String toString() {
		String smartTvStatus = smart ? "SI" : "NO";
		return super.toString() + "Dimensioni Display:" + " " + dimensioni + " "  + "Pollici"+ "\n"
								+ "SmartTv:" + " " + smartTvStatus + "\n"
								+ "Prezzo Scontao:" + " " + getPrezzoScontato() + "€" + "\n"
								+"--------------------------";
	}
	
}
