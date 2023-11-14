package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	
	private String codeImei;
	private int memory;


	public Smartphone(String nome,String descrizione,double prezzo,int iva,String product,String codeImei,int memory) {
		super(nome,descrizione,prezzo,iva,product);
		
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
	@Override
	public String toString() {
		return super.toString() + "Codice IMEI:" + " " + codeImei + "\n"
								+ "Dimensione Memoria:" + " " + memory + "GB" + "\n"
								+"--------------------------";
	}
}
