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
		assertEquals("O número é par.", desafio.par(12));
		assertEquals("O número é ímpar.", desafio.par(37));
	}

	@Test
	public void testMaiorQue10() {
		assertEquals("O número é maior que 10.", desafio.maiorQue10(17));
		assertEquals("O número é igual a 10.", desafio.maiorQue10(10));
		assertEquals("O número é menor que 10.", desafio.maiorQue10(3));
	}
	
	@Test
	public void testDobro() {
	assertEquals("O dobro é: " + 94, desafio.dobro(47));
	}
	
	@Test
	public void testPrimo() {
		assertEquals("O número é primo.", desafio.primo(17));
		assertEquals("O número não é primo.", desafio.primo(32));
	}
	
}
