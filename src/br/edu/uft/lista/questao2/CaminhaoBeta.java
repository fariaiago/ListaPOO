package br.edu.uft.lista.questao2;

public class CaminhaoBeta extends Caminhao {
	
	@Override
	public void inserePluviometro(Pluviometro novo) {
		if (!this.carga.contains(novo)) {
			super.inserePluviometro(novo);
		}
	}
	
	@Override
	public String toString() {
		return "Beta";
	}
}