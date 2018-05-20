package br.com.desafio.classe;

import java.util.Scanner;

public class DesafioMath {

	private static Scanner entrada;

	private void recebeEntrada() {
		entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = entrada.nextInt();

		System.out.println(par(numero));
		System.out.println(maiorQue10(numero));
		System.out.println(dobro(numero));
		System.out.println(primo(numero));
	}

	public String par(int numero) {
		if (numero % 2 == 0) {
			return "O número é par.";
		} else {
			return "O número é ímpar.";
		}
	}

	public String maiorQue10(int numero) {
		if (numero > 10) {
			return "O número é maior que 10.";
		} else if (numero == 10) {
			return "O número é igual a 10.";
		} else {
			return "O número é menor que 10.";
		}
	}

	public String dobro(int numero) {
		return "O dobro é: " + numero * 2;
	}

	public String primo(int numero) {
		if ((numero == 1) || (numero == 2) || (numero == 3) || (numero == 5) || (numero == 7)) {
			return "O número é primo.";
		} else if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0) {
			return "O número não é primo.";
		} else {
			return "O número é primo.";
		}
	}

	public static void main(String[] args) {
		DesafioMath programa = new DesafioMath();
		programa.recebeEntrada();
	}

}
