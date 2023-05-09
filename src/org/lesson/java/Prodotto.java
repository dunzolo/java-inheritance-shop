package org.lesson.java;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String marca;
	private float prezzo;
	private int iva;
	
	public Prodotto(String nome, String marca, float prezzo, int iva) {
		Random rnd = new Random();
		int codice = rnd.nextInt(0, 99999999);
		
		this.codice = codice;
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
	}
	//get & set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public int getCodice() {
		return codice;
	}
	
	//metodo prezzo comprensivo di iva
	public float getPrezzoIva() {
		float calc = (this.prezzo / 100f) * this.iva;
		return this.prezzo + calc;
	}
	
	//metodo per stampare tutti gli attributi
	protected String getProdottoString() {
		return "[" + getCodice() + "]" 
			+ "\nNome: " + getNome() 
			+ "\nMarca: " + getMarca()
			+ "\nPrezzo: " + getPrezzo() + "€"
			+ "\nPrezzo con iva: " + getPrezzoIva() + "€";
	}
	
	@Override
	public String toString() {
		return "(P) " + getProdottoString();
	}
}
