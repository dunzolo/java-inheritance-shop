package org.lesson.java;

import java.util.Random;

public class Smartphone extends Prodotto{
	private int codice_IMEI;
	private int memoria;

	public Smartphone(String nome, String marca, float prezzo, int iva, int memoria) {
		super(nome, marca, prezzo, iva);
		
		Random rnd = new Random();
		int codice = rnd.nextInt(0, 99999999);
		
		this.codice_IMEI = codice;
		setMemoria(memoria);
	}

	//get e set
	public int getCodice_IMEI() {
		return codice_IMEI;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	//metodo per stampare tutti gli attributi
	protected String getSmartphoneString() {
		return "[" + getCodice() + "]" 
			+ "\nNome: " + getNome() 
			+ "\nMarca: " + getMarca()
			+ "\nPrezzo: " + getPrezzo() + "€"
			+ "\nPrezzo con iva: " + getPrezzoIva() + "€"
			+ "\nCodice IMEI: " + getCodice_IMEI() 
			+ "\nMemoria: " + getMemoria() + "GB";
	}
	
	@Override
	public String toString() {
		return "(P) " + getSmartphoneString();
	}
}
