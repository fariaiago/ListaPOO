package br.edu.uft.lista.questao2;

import java.util.ArrayList;
import java.util.List;

public class Caminhao {
	List<Pluviometro> carga = new ArrayList<>();
	
	public Caminhao() {
//		TODO
	}
	
	public void inserePluviometro(Pluviometro novo) {
		this.carga.add(novo);
	}
	
	public List<Pluviometro> getCarga() {
		return this.carga;
	}
}