package org.lessons.java.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
	public static void main(String[] args) {
		
		Scanner in= new Scanner(System.in);
		ArrayList<Prodotto> carrello = new ArrayList<>();
		
		while(true) {
		System.out.println("Se si vuole aggiungere un prodotto digitare SI altrimenti NO");
		String input = in.nextLine();
			if(input.equals("si")) {
				System.out.println("Digita il numero corrispondente al prodotto che vuoi inerire: \n"
						+ "1: Smartphone \n"
						+ "2: Televisore \n"
						+ "3: Cuffie ");
				System.out.println("--------------------------");
				int product = in.nextInt();
				in.nextLine();
				System.out.println("Inserisci il nome del prodotto");
				String nome=in.nextLine();
				System.out.println("Inserisci una descrizione");
				String descrizione=in.nextLine();
				System.out.println("Inserisci il prezzo del prodotto: ");
				int prezzo=in.nextInt();
				in.nextLine();
				System.out.println("Inserisci l'IVA: ");
				int iva=in.nextInt();
				in.nextLine();
				
				String prod="";
				if(product == 1) {
					prod = "Smartphone";
					System.out.println("Inserisci il codice IMEI:");
					String codeImei=in.nextLine();
					System.out.println("Inserisci lo spazio di memoria dello smartphone in GB");

					int memory=in.nextInt();
					in.nextLine();
					Smartphone p1= new Smartphone(nome,descrizione,prezzo,iva,prod,codeImei,memory);
					System.out.println("--------------------------");
					System.out.println(p1);
					carrello.add(p1);
				}
				else if(product == 2) {
					prod ="Televisore";
					System.out.println("Inserisci le dimensioni in pollici del televisore:");
					int dimensioni=in.nextInt();
					in.nextLine();
					System.out.println("Il televisore è una SmartTv? digitare SI o NO");
					boolean smart;
					String smartInput = in.nextLine();
					
					if (smartInput.equalsIgnoreCase("SI")) {
						smart = true;
					} else if (smartInput.equalsIgnoreCase("NO")) {
						smart = false;
					} else {
						smart = false;
					}
					
					Televisori p1= new Televisori (nome,descrizione,prezzo,iva,prod,dimensioni,smart);
					System.out.println("--------------------------");
					System.out.println(p1);
					carrello.add(p1);
				}
				else {
					prod ="Cuffie";
					System.out.println("Di che colore sono le cuffie:");
					String color=in.nextLine();
					
					System.out.println("Le cuffie sono wireless? digitare SI o NO");
					boolean wireless;
					String wirelessInput = in.nextLine();
					
					if (wirelessInput.equalsIgnoreCase("SI")) {
					    wireless = true;
					} else if (wirelessInput.equalsIgnoreCase("NO")) {
					    wireless = false;
					} else {
					    wireless = false;
					}
				
					Cuffie p1= new Cuffie (nome,descrizione,prezzo,iva,prod,color,wireless);
					
					System.out.println("--------------------------");
					System.out.println(p1);
					carrello.add(p1);
				}
				
			}else {	
				System.out.println("Operazione annullata");
				System.out.println("--------------------------");
				System.out.println("Carrello:" + "\n"
						+ "--------------------------");
				for (Prodotto prodotto : carrello) {
					System.out.println(prodotto);
				}
				break;
				}
	}
}
}