package br.com.capgemini.desafio.funcoes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class QuestaoTres {

	/**
	 * Método main chama o método constroiParesAnagrama() e retorna sua resposta;
	 * 
	 * @param String palavra recebe a palavra que será analisada no método
	 *               constroiParesAnagrama()
	 * 
	 * @return int valor retorna o número de pares de anagrama da palavra digitada
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String palavra;
		int valor;

		System.out.print("Digite uma palavra qualquer: ");
		palavra = entrada.next();
		valor = constroiParesAnagrama(palavra);

		System.out.println(valor);
	}

	/**
	 * Método constroiParesAnagrama() recebe uma string e retorna a quantidade de pares
	 * de anagramas que são possíveis formar a partir do input recebido.
	 * 
	 * A palavra recebida no método é transformada, através do laço for, em um array
	 * com todos os possíveis pares de substring, e depois ordenado através do sort.
	 * 
	 * A estrutura boleana separa a quantidade de anagramas e as armazena junto a
	 * sua chave no map.
	 * 
	 * Outro laço for é feito para definir os pares de anagramas e esse valor é
	 * armazenado em paresAnagrama
	 * 
	 * @return int paresAnagrama retorna o valor de pares de anagramas encontrado na
	 *         string palavra
	 */

	public static Integer constroiParesAnagrama(String palavra) {

		HashMap<String, Integer> map = new HashMap<>();
		int a, b, tamanho = palavra.length();

		for (a = 0; a < tamanho; a++) {
			for (b = a; b < tamanho; b++) {
				char[] arrayPalavra = palavra.substring(a, b + 1).toCharArray();
				Arrays.sort(arrayPalavra);
				String chaveArrayPalavra = new String(arrayPalavra);
				if (map.containsKey(chaveArrayPalavra))
					map.put(chaveArrayPalavra, map.get(chaveArrayPalavra) + 1);
				else
					map.put(chaveArrayPalavra, 1);
			}
		}

		int paresAnagrama = 0;

		for (String chave : map.keySet()) {
			int x = map.get(chave);
			paresAnagrama += (x * (x - 1)) / 2;
		}

		return paresAnagrama;
	}
}