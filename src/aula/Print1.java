package aula;

import java.util.Scanner;

class Print1 {
	
	public double adicao(double n, double n1) {
		return n + n1;
	}
	
	public double subtracao(double n, double n1) {
		return n - n1;
	}
	public double multiplicacao(double n, double n1) {
		return n * n1;
	}
	public double divisao(double n, double n1) {
		return n / n1;
	}
	public static void main(String[] args) {
		Print1 ex = new Print1();
		
		Scanner print1 = new Scanner(System.in);
		int n = 0;
		System.out.println("Digite o primeiro número: ");
		n = print1.nextInt();
		int n1 = 0;
		System.out.println("Digite o segundo número: ");
		n1 = print1.nextInt();
		
		System.out.println(ex.adicao(n, n1));
		System.out.println(ex.subtracao(n, n1));
		System.out.println(ex.multiplicacao(n, n1));
		System.out.println(ex.divisao(n, n1));
	}
}
