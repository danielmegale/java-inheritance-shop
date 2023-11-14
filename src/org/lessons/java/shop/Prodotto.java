package org.lessons.java.shop;

import java.util.Random;



public class Prodotto { 
	private int codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private int	iva;
	
	public Prodotto (String nome,String descrizione,double prezzo,int iva) {
		setCodice();
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	public int getCodice() {
		return codice;
	}
	private void setCodice() {
		Random rdm= new Random();
		int rdmCodice=rdm.nextInt(0,Integer.MAX_VALUE);
		this.codice = rdmCodice;
	}
	public String getNome() {
		
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		
		this.iva = iva;
	}
	public String getPrezzoCompleto() {
		double prezzoIva = (prezzo*iva)/100;
		double prezzoCompleto =prezzoIva+prezzo;
		return String.format("%.02f",prezzoCompleto);
	}
	public String getCodeName() {
	String fullName= codice+"-"+nome;
	return fullName;
	}
	public String getCodiceEsteso() { 
		String codeLgh= String.valueOf(codice);
		String zeros="";
		int sot=8-codeLgh.length();
		if( codeLgh.length() <= 8) {
			for(int i=0 ;i<sot;i++){
				zeros+="0";
			}
		}
		return zeros+codice;
		
	}
}
