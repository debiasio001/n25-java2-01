package br.com.senaisp.bauru.secao03.aula06;

public class Parsing01 {

	public static void main(String[] args) {
		int shirtPrice = Integer.parseInt("15");
		double taxRate = Double.parseDouble("0.05");
		String gibberish = "887ds7nds87dsfs";
		// mpostrando os valores 
		System.out.println("preço da camisa: "+ shirtPrice);
		System.out.println("percentual imposto: "+ taxRate);
		// exemplos de erros de conversão abaixo!
		System.out.println("percentual imposto: "+ Integer.parseInt("0.05"));
		System.out.println("gibberish para int: "+ Integer.parseInt(gibberish));
		
	}

}
