package aula;

import java.util.Scanner;

class Print2 {
		
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
		Print2 ex = new Print2();
		
	    Scanner print2 = new Scanner(System.in);
			
		double n;
		System.out.println("Digite um n�mero: ");
		n = print2.nextDouble();
		double n1;
		System.out.println("Digite um n�mero: ");
		n1 = print2.nextDouble();
		int op;
		System.out.println("1 - Adi��o | 2 - Subtra��o | 3 - Multiplica��o | 4 - Divis�o");
		op = print2.nextInt();
		
		switch(op) {
		case 1: 
			System.out.println(ex.adicao(n, n1));
			break;
		case 2: 
			System.out.println(ex.subtracao(n, n1));
			break;
		case 3: 
			System.out.println(ex.multiplicacao(n, n1));
			break;
		case 4: 
			System.out.println(ex.divisao(n, n1));
			break;
		default:
			System.out.println("Op��o digitada inv�lida");
			break;
			
			
		}

	}

}
