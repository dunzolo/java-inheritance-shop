package org.lesson.java;

public class Cuffia extends Prodotto{
	private String colore;
	private boolean tipo;

	public Cuffia(String nome, String marca, float prezzo, int iva, String colore, boolean tipo) {
		super(nome, marca, prezzo, iva);
		setColore(colore);
		setTipo(tipo);
	}
	
	//get e set
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	
	//metodo per stampare tutti gli attributi
	protected String getCuffiaString() {
		return "[" + getCodice() + "]" 
			+ "\nNome: " + getNome() 
			+ "\nMarca: " + getMarca()
			+ "\nPrezzo: " + getPrezzo() + "€"
			+ "\nPrezzo con iva: " + getPrezzoIva() + "€"
			+ "\nColore: " + getColore() 
			+ "\nWireless: " + isTipo();
	}
	
	@Override
	public String toString() {
		return "(P) " + getCuffiaString();
	}
	
	
}
