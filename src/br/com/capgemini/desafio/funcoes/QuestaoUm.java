package br.com.capgemini.desafio.funcoes;

import java.util.Scanner;

public class QuestaoUm {
	
	/**
	 * O método main chama o método constroiEscada() e retorna sua resposta
	 * 
	 * @param int quantDegraus determina a quantidade de linhas(*) que definirá a
	 *            escada
	 * @return String escadaConstruida retorna o desenho da escada
	 */
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int quantDegraus;
		String escadaConstruida;

		System.out.print("Digite a quantidade de degraus da sua escada: ");
		quantDegraus = scanner.nextInt();
		escadaConstruida = constroiEscada(quantDegraus);

		System.out.println(escadaConstruida);
	}

	public static String constroiEscada(int numero) {

	/**
	* O método constroiEscada() realiza um laço for através do iterador i, que é o
	* responsável por verificar qual linha da escada está sendo construida,
	* adicionar espaços e asteriscos até chegar ao tamanho final.
	* 
	* @return String escada retorna o desenho da escada O método repeat() é usado
	*         para construir e retornar uma String cujo o valor é a concatenação de
	*         determinadas vezes de contagem repetida de String.
	*/

		int i;
		String escada = "";

		for (i = 1; i <= numero; i++) {
			escada += " ".repeat(numero - i) + "*".repeat(i) + "\n";
		}

		return escada;
	}
}