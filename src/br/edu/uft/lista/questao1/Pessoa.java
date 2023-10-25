package br.edu.uft.lista.questao1;

/**
 * Representa genericamente uma pessoa
 */
public interface Pessoa {
	
	/**
	 * Retorna o CPF da pessoa
	 * @return
	 */
	String getCPF();
	
	/**
	 * Retorna o nome da pessoa
	 * @return
	 */
	String getNome();
	
	/**
	 * Recebe como parâmetro o número da cadeira e retorna 'F' se for uma cadeira para fumantes e 'N' se for para não fumantes
	 * @param numeroCadeira
	 * @return
	 */
	char tipo(int numeroCadeira);
}