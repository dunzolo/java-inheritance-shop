package org.lesson.java;

import java.util.Scanner;

public class Catalogo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Prodotto[] arr = new Prodotto[10];
		
		int count = 0;
		
		while(true) {
			
			System.out.println("Che tipo di prodotto vuoi registrare?");
			System.out.println("1 - Televisore");
			System.out.println("2 - Cuffia");
			System.out.println("3 - Smartphone");
			System.out.println("4 - Chiudere catalogo");
			
			int n = sc.nextInt();
			
			if(n < 1 || n > 4) {
				System.err.println("Opzione non valida");	
				continue;	
			}
			
			if (n == 4) break;
			
			System.out.println("Inserisci il nome");
			String nome = sc.next();
			
			System.out.println("Inserisci la marca");
			String marca = sc.next();
			
			System.out.println("Inserisci il prezzo");
			float prezzo = sc.nextInt();
			
			System.out.println("Inserisci l'iva");
			int iva = sc.nextInt();
			
			switch (n) {
				case 1:{
					System.out.println("Inserisci le dimensioni");
					String dimensioni = sc.next();
					
					System.out.println("Inserisci se è smart oppure no");
					String res = sc.next();
					
					boolean smart = false;
					
					if(res.equals("Si")) {
						smart = true;
					}
					
					Televisore t = new Televisore (nome, marca, prezzo, iva, dimensioni, smart);
					
					arr[count++] = t;
				}
				break;
				case 2:{
					System.out.println("Inserisci il colore");
					String colore = sc.next();
					
					System.out.println("Inserisci se è wireless oppure no");
					String res = sc.next();
					
					boolean wireless = false;
					
					if(res.equals("Si")) {
						wireless = true;
					}
					
					Cuffia c = new Cuffia(nome, marca, prezzo, iva, colore, wireless);
					
					arr[count++] = c;
				}
				break;
				case 3:{
					System.out.println("Inserisci la memoria");
					int memoria = sc.nextInt();
					
					Smartphone s = new Smartphone(nome, marca, prezzo, iva, memoria);
					
					arr[count++] = s;
				}
				break;
			}
		}
		System.out.println("Elenco catalogo");
		
		for (int i = 0; i < count; i++) {
			Prodotto p = arr[i];
			System.out.println(p);
		}
		
	}
}
