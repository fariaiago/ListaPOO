package br.edu.uft.lista.questao3;

import java.util.ArrayList;
import java.util.List;

import br.edu.uft.lista.questao2.Caminhao;
import br.edu.uft.lista.questao2.CaminhaoAlfa;
import br.edu.uft.lista.questao2.CaminhaoBeta;
import br.edu.uft.lista.questao2.Pluviometro;

public class ControleHerdeiro extends Controle {
	public static void selecionarCaminhao() {
		List<Caminhao> caminhoes = new ArrayList<>();
		String caminhaoTipo;
		while (!"fim".equals(caminhaoTipo = Controle.stdIn.next()) ) {
			Caminhao caminhao = "Alfa".equals(caminhaoTipo) ? new CaminhaoAlfa() : new CaminhaoBeta();
			int numPluviometro = Controle.stdIn.nextInt();
			for (int i = 0; i < numPluviometro; i++) {
				caminhao.inserePluviometro( new Pluviometro(Controle.stdIn.next()));
			}
			caminhoes.add(caminhao);
		}
		caminhoes.sort((a, b) -> a.getCarga().size() - b.getCarga().size());
		Caminhao apto = caminhoes.get(caminhoes.size() - 1);
		System.out.println(apto.toString());
		apto.getCarga().forEach((p) -> System.out.println(p.toString()));
		System.out.println();
	}
}