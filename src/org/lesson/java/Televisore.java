package org.lesson.java;

public class Televisore extends Prodotto{
	private String dimensioni;
	private boolean smart;

	public Televisore(String nome, String marca, float prezzo, int iva, String dimensioni, boolean smart) {
		super(nome, marca, prezzo, iva);
		
		setDimensioni(dimensioni);
		setSmart(smart);
	}

	//get e set
	public String getDimensioni() {
		return dimensioni;
	}
	public void setDimensioni(String dimensioni) {
		this.dimensioni = dimensioni;
	}
	public boolean isSmart() {
		return smart;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	//metodo per stampare tutti gli attributi
	protected String getTelevisoreString() {
		return "[" + getCodice() + "]" 
			+ "\nNome: " + getNome() 
			+ "\nMarca: " + getMarca()
			+ "\nPrezzo: " + getPrezzo() + "€"
			+ "\nPrezzo con iva: " + getPrezzoIva() + "€"
			+ "\nDimensioni: " + getDimensioni() 
			+ "\nSmart: " + isSmart();
	}
	
	@Override
	public String toString() {
		return "(P) " + getTelevisoreString();
	}
}
