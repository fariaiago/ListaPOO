package br.edu.uft.lista.questao2;

public class Pluviometro {
	protected String tipo;

	public Pluviometro(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getPeso() {
//		TODO
	}
	
	public int getCapacidade() {
//		TODO
	}
	
	@Override
	public String toString() {
		return this.getTipo();
	}
}