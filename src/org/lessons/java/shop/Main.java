package org.lessons.java.shop;

public class Main {
	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto("Cuffie","Cuffie Wireless" ,29.99d,22);
		p1.setIva(15); 
		Prodotto p2 = new Prodotto("Tastiera","Tastiera Meccanica Wireless - Italiana QWERTY USB Ergonomica",99.99,22);
		
		
		System.out.println("P1:");
		System.out.println("Codice: " + p1.getCodiceEsteso());
		System.out.println("Nome:" + " " + p1.getNome());
		System.out.println("Code Name:" + " " + p1.getCodeName());
		System.out.println("Descrizione:" + " " + p1.getDescrizione());
		System.out.println("Prezzo Netto: " + " " + p1.getPrezzo() + "€");
		System.out.println("Prezzo Lordo: " + " " + p1.getPrezzoCompleto() + "€");
		System.out.println("Iva: " + " " + p1.getIva() + "%");
		System.out.println("------------------------");
		
		System.out.println("P2:");
		System.out.println("Codice: " + p2.getCodiceEsteso());
		System.out.println("Nome:" + " " + p2.getNome());
		System.out.println("Code Name:" + " " + p2.getCodeName());
		System.out.println("Descrizione:" + " " + p2.getDescrizione());
		System.out.println("Prezzo Netto: " + " " + p2.getPrezzo() + "€");
		System.out.println("Prezzo Lordo: " + " " + p2.getPrezzoCompleto() + "€");
		System.out.println("Iva: " + " " + p2.getIva() + "%");
		System.out.println("------------------------");
		
	}
}
