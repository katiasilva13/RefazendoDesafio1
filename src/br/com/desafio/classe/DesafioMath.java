package br.com.desafio.classe;

import java.util.Scanner;

public class DesafioMath {

	private static Scanner entrada;

	private void recebeEntrada() {
		entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int numero = entrada.nextInt();

		System.out.println(par(numero));
		System.out.println(maiorQue10(numero));
		System.out.println(dobro(numero));
		System.out.println(primo(numero));
	}

	public String par(int numero) {
		if (numero % 2 == 0) {
			return "O n�mero � par.";
		} else {
			return "O n�mero � �mpar.";
		}
	}

	public String maiorQue10(int numero) {
		if (numero > 10) {
			return "O n�mero � maior que 10.";
		} else if (numero == 10) {
			return "O n�mero � igual a 10.";
		} else {
			return "O n�mero � menor que 10.";
		}
	}

	public String dobro(int numero) {
		return "O dobro �: " + numero * 2;
	}

	public String primo(int numero) {
		if ((numero == 1) || (numero == 2) || (numero == 3) || (numero == 5) || (numero == 7)) {
			return "O n�mero � primo.";
		} else if (numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 || numero % 7 == 0) {
			return "O n�mero n�o � primo.";
		} else {
			return "O n�mero � primo.";
		}
	}

	public static void main(String[] args) {
		DesafioMath programa = new DesafioMath();
		programa.recebeEntrada();
	}

}
