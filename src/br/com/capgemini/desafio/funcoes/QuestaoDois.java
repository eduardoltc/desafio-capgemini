package br.com.capgemini.desafio.funcoes;

import java.util.Scanner;
import java.util.regex.Pattern;

public class QuestaoDois {
	/**
	 * M�todo main chama o m�todo validaSenha() e retorna sua resposta
	 * 
	 * @param String senha recebe a palavra que ser� validada no metodo
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
	 * M�todo validaSenha() recebe uma string e an�lisa, atrav�s de express�es
	 * regulares, se a senha � forte ( senha == 0) ou fraca ( senha > 0).
	 * 
	 * @param senhaMinuscula express�o regular que valida se a senha possui
	 *                       caracteres min�sculos
	 * @param senhaMaiuscula express�o regular que valida se a senha possui
	 *                       caracteres mai�sculos
	 * @param senhaDigito    express�o regular que valida se a senha possui
	 *                       caracteres num�ricos
	 * @param senhaEspecial  express�o regular que valida se a senha possui
	 *                       caracteres especiais
	 * 
	 * @param Boolean        para cada pattern -> Verdadeiro se cumpre os requisitos
	 *                       do pattern -> Falso se n�o cumpre os requisitos do
	 *                       pattern, adiciona 1 a x.
	 * 
	 * @return int x se o tamanho da senha mais o valor de x for maior que 6, sen�o
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