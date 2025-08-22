package br.com.senaisp.bauru.secao08.aula15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExcecao {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
		System.out.println("digite o valor de a: ");
		int a= sc.nextInt();
		System.out.println("digite o valor de b: ");
		int b= sc.nextInt();
		
	    	System.out.println(a/b);
	    }catch(ArithmeticException e) {
	    	System.out.println("Ocorreu um erro divisão por zero!");
	    }catch(InputMismatchException e) {
	    	System.out.println("o valor deve ser inteiro!");
	    }catch (Exception e) {// erro genérico
	    	System.out.println("Ocorreu um erro diferente:"+e.getMessage());
	    }
	    System.out.println("se nao der erro eu apareço!!");
	    dividirValores(10, 0);
	    System.out.println("Não chego aqui");
	}
	public static void dividirValores(int a, int b) {
		if (b==0) {
			throw new RuntimeException("O valor de b deve ser maior ou menor que 0!");
		}
		System.out.println(a/b);
	}
}
