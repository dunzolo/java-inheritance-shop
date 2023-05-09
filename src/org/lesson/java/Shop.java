package org.lesson.java;

public class Shop {
	public static void main(String[] args) {
		
		Prodotto p = new Prodotto("Prodotto", "Marca", 10, 22);
		System.out.println(p);
		System.out.println("--------------------------");
		
		Smartphone s = new Smartphone("iPhone", "Apple", 800, 22, 256);
		s.setMemoria(512);
		System.out.println(s);
		System.out.println("--------------------------");
		
		Televisore t = new Televisore("Televisore", "HP", 568, 18, "800x500x5", false);
		t.setSmart(true);
		t.setMarca("LG");
		System.out.println(t);
		System.out.println("--------------------------");
		
		Cuffia c = new Cuffia("Soundcore", "Anker", 30, 22, "Rosso", true);
		c.setColore("Nero");
		System.out.println(c);
		System.out.println("--------------------------");
	}
}
