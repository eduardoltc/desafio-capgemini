package br.com.capgemini.desafio.testes;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.capgemini.desafio.funcoes.QuestaoUm;

public class QuestaoUmTeste {

	@Test
	public void escadaTamanhoSeis() {

		String respostaEsperada = "     *\n    **\n   ***\n  ****\n *****\n******\n";

		String escada;
		escada = QuestaoUm.constroiEscada(6);

		Assert.assertNotNull(escada);
		Assert.assertEquals(respostaEsperada, escada);
	}
	
	@Test
	public void escadaTamanhoTres() {

		String respostaEsperada = "  *\n **\n***\n";

		String escada;
		escada = QuestaoUm.constroiEscada(3);

		Assert.assertNotNull(escada);
		Assert.assertEquals(respostaEsperada, escada);
	}

	@Test
	public void escadaTamanhoUm() {

		String respostaEsperada = "*\n";

		String escada;
		escada = QuestaoUm.constroiEscada(1);

		Assert.assertEquals(respostaEsperada, escada);
	}
}