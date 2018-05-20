package br.com.desafio.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.desafio.classe.DesafioMath;
import junit.framework.Assert;

public class DesafioMathTeste {

	private DesafioMath desafio = new DesafioMath();
	
	@Test
	public void testPar() {
		assertEquals("O n�mero � par.", desafio.par(12));
		assertEquals("O n�mero � �mpar.", desafio.par(37));
	}

	@Test
	public void testMaiorQue10() {
		assertEquals("O n�mero � maior que 10.", desafio.maiorQue10(17));
		assertEquals("O n�mero � igual a 10.", desafio.maiorQue10(10));
		assertEquals("O n�mero � menor que 10.", desafio.maiorQue10(3));
	}
	
	@Test
	public void testDobro() {
	assertEquals("O dobro �: " + 94, desafio.dobro(47));
	}
	
	@Test
	public void testPrimo() {
		assertEquals("O n�mero � primo.", desafio.primo(17));
		assertEquals("O n�mero n�o � primo.", desafio.primo(32));
	}
	
}
