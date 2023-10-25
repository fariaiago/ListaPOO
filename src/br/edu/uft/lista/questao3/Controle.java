package br.edu.uft.lista.questao3;

import java.util.Scanner;

public class Controle {
	static Scanner stdIn;
	
	String leString() {
		if (Controle.stdIn == null) {
			Controle.stdIn = new Scanner(System.in);
		}
		return stdIn.next();
	}
	
	int leInteito() { // Mantive o typo
		if (Controle.stdIn == null) {
			Controle.stdIn = new Scanner(System.in);
		}
		return stdIn.nextInt();
	}
}