package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	
	private String codeImei;
	private int memory;


	public Smartphone(String nome,String descrizione,double prezzo,int iva,String product,boolean fedelty,String codeImei,int memory) {
		super(nome,descrizione,prezzo,iva,product,fedelty);
		
		setCodeImei(codeImei);
		setMemory(memory);
	}

	public String getCodeImei() {
		return codeImei;
	}

	public void setCodeImei(String codeImei) {
		this.codeImei = codeImei;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
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
	    if (memory < 32) {
	        sconto += 0.05;
	    }
	    double scontato = getPrezzoCompleto() * sconto;
	    double prezzoScontato = getPrezzoCompleto()-scontato;
	    return String.format("%.02f", prezzoScontato);
	}
	@Override
	public String toString() {
		return super.toString() + "Codice IMEI:" + " " + codeImei + "\n"
								+ "Dimensione Memoria:" + " " + memory + "GB" + "\n"
								+ "Prezzo Scontao:" + " " + getPrezzoScontato() + "€" + "\n"
								+"--------------------------";
	}
}
