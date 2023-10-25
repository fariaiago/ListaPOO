package br.edu.uft.lista.questao1;

/**
 * Representa genericamente um repositório
 */
public interface Repositorio {
	
	/**
	 * Guarda uma pessoa
	 * @param nova
	 */
	void guarda(Pessoa nova);
	
	/**
	 * Recupera pessoa com o CPF informado
	 * @param CPF
	 * @return
	 */
	Pessoa recupera(String CPF);
	
	/**
	 * Se desloca para a primeira pessoa e a retorna
	 * @return
	 */
	Pessoa primeiro();
	
	/**
	 * Se desloca para a próxima pessoa e a retorna
	 * @return
	 */
	Pessoa proximo();
}