package br.edu.uft.lista.questao2;

public class CaminhaoAlfa extends Caminhao {
	private int pesoCarga;

	@Override
	public void inserePluviometro(Pluviometro novo) {
		if (this.pesoCarga + novo.getPeso() <= 5000) {
			this.pesoCarga += novo.getPeso();
			super.inserePluviometro(novo);
		}
	}
	
	@Override
	public String toString() {
		return "Alfa";
	}
}