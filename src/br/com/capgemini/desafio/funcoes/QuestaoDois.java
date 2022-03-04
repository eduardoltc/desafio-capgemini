package br.com.capgemini.desafio.funcoes;

import java.util.Scanner;
import java.util.regex.Pattern;

public class QuestaoDois {
	/**
	 * Método main chama o método validaSenha() e retorna sua resposta
	 * 
	 * @param String senha recebe a palavra que será validada no metodo
	 *               validaSenha()
	 * @return int valor retorna um numero maior que 0 se a senha for validada como
	 *         fraca ou 0 se a senha for validada como forte
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String senha;
		int valor;

		System.out.print("Escreva sua senha: ");
		senha = entrada.next();
		valor = validaSenha(senha);

		System.out.println(valor);
	}

	/**
	 * Método validaSenha() recebe uma string e análisa, através de expressões
	 * regulares, se a senha é forte ( senha == 0) ou fraca ( senha > 0).
	 * 
	 * @param senhaMinuscula expressão regular que valida se a senha possui
	 *                       caracteres minúsculos
	 * @param senhaMaiuscula expressão regular que valida se a senha possui
	 *                       caracteres maiúsculos
	 * @param senhaDigito    expressão regular que valida se a senha possui
	 *                       caracteres numéricos
	 * @param senhaEspecial  expressão regular que valida se a senha possui
	 *                       caracteres especiais
	 * 
	 * @param Boolean        para cada pattern -> Verdadeiro se cumpre os requisitos
	 *                       do pattern -> Falso se não cumpre os requisitos do
	 *                       pattern, adiciona 1 a x.
	 * 
	 * @return int x se o tamanho da senha mais o valor de x for maior que 6, senão
	 *         retorna int y, indicando quantos digitos faltam para formar uma senha
	 *         forte.
	 */
	
	public static Integer validaSenha(String senha) {
		int tamanho = senha.length();
		int x = 0;
		int y;
		boolean senhaMinuscula = Pattern.matches("^(?=.*[a-z]).+$", senha),
				senhaMaiuscula = Pattern.matches("^(?=.*[A-Z]).+$", senha),
				senhaDigito = Pattern.matches("^(?=.*\\d).+$", senha),
				senhaEspecial = Pattern.matches("^(?=.*[-+_!@#$%^&*.,?]).+$", senha);

		if (senhaMinuscula == false) {
			x += 1;
		}

		if (senhaMaiuscula == false) {
			x += 1;
		}

		if (senhaDigito == false) {
			x += 1;
		}

		if (senhaEspecial == false) {
			x += 1;
		}

		if (tamanho + x >= 6) {
			return x;
		}

		else {
			y = (6 - tamanho);
			return y;
		}
	}
}