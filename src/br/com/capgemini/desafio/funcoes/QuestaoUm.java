package br.com.capgemini.desafio.funcoes;

import java.util.Scanner;

public class QuestaoUm {
	
	/**
	 * O m�todo main chama o m�todo constroiEscada() e retorna sua resposta
	 * 
	 * @param int quantDegraus determina a quantidade de linhas(*) que definir� a
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
	* O m�todo constroiEscada() realiza um la�o for atrav�s do iterador i, que � o
	* respons�vel por verificar qual linha da escada est� sendo construida,
	* adicionar espa�os e asteriscos at� chegar ao tamanho final.
	* 
	* @return String escada retorna o desenho da escada O m�todo repeat() � usado
	*         para construir e retornar uma String cujo o valor � a concatena��o de
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