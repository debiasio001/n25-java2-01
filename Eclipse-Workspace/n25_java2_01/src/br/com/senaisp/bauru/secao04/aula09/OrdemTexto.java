package br.com.senaisp.bauru.secao04.aula09;

import java.util.Scanner;

public class OrdemTexto {

	public static void main(String[] args) {
		//
		Scanner sc =  new Scanner(OrdemTexto.class
				.getResourceAsStream("palavras.txt"));
		String maiorTexto, menorTexto;
		//setando o maior e menor com o primeiro texto
		maiorTexto = sc.nextLine();
		menorTexto = maiorTexto;// igualando os endereços para o mesmo conteudo
		//vamos usar o while (ja viu no java 1)
		while (sc.hasNextLine()) {
			String apoio = sc.nextLine();
			// comparando os textos -menor
			if (apoio.compareTo(menorTexto)<0) {
				menorTexto = "" + apoio;
			}
			//comparando os textos - menor
			if (apoio.compareTo(maiorTexto)>0) {
				maiorTexto = "" + apoio;
			}
			
		}
		System.out.println("Maior texto foi " + maiorTexto);
		System.out.println("Menor texto foi " + menorTexto);
		//fechando o arquivo
		sc.close();
		
	}

}
