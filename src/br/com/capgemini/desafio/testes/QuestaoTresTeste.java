package br.com.capgemini.desafio.testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.capgemini.desafio.funcoes.QuestaoTres;

public class QuestaoTresTeste {

	@Test
	public void anagramaExemploUm() {

		int respostaEsperada = 2;
		int pares;
		pares = QuestaoTres.constroiParesAnagrama("ovo");
		Assert.assertNotNull(pares);
		Assert.assertEquals(respostaEsperada, pares);
	}

	@Test
	public void anagramaExemploDois() {
		
		int respostaEsperada = 3;
		int pares;
		pares = QuestaoTres.constroiParesAnagrama("ifailuhkqq");
		Assert.assertEquals(respostaEsperada, pares);
	}
	
	@Test
	public void anagramaMaiorPalavra() {

		int respostaEsperada = 231;
		int pares;
		pares = QuestaoTres.constroiParesAnagrama("Pneumoultramicroscopicossilicovulcanoconiotico");
		Assert.assertEquals(respostaEsperada, pares);
	}
	
	@Test
	public void anagramaMenorPalavra() {

		int respostaEsperada = 0;
		int pares;
		pares = QuestaoTres.constroiParesAnagrama("a");
		Assert.assertEquals(respostaEsperada, pares);
	}
}