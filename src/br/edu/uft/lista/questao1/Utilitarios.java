package br.edu.uft.lista.questao1;

public class Utilitarios {
	
	/**
	 * Recebe como parâmetro dois objetos que implementam a interface Repositorio: A e B e copia todas as pessoas
	 * do repositório A para o repositório B.
	 * @param A
	 * @param B
	 */
	void duplica(Repositorio A, Repositorio B) {
		Pessoa itr = A.primeiro();
		while (itr != null) {
			B.guarda(itr);
			itr = A.proximo();
		}
	}
	
	/**
	 * Recebe como parâmetro três objetos que implementam a interface Repositorio: A, B e C e coloca no repositorio
	 * C todas as pessoas de A que não estão em B.
	 * @param A
	 * @param B
	 * @param C
	 */
	void diferenca(Repositorio A, Repositorio B, Repositorio C) {
		Pessoa itrA = A.primeiro();
		while (itrA != null) {
			Pessoa itrB = B.primeiro();
			boolean presenteEmBFlag = false;
			while (itrB != null) {
				if (itrB.equals(itrA)) {
					presenteEmBFlag = true;
				}
				itrB = B.proximo();
			}
			if (!presenteEmBFlag) {
				C.guarda(itrA);
			}
			itrA = A.proximo();
		}
	}
}