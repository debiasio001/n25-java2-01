package br.com.senaisp.bauru.secao03.aula05;

public class Casting01 {

	public static void main(String[] args) {
		//esta linha a baixo da erro pq o byte vai de -128 á 127
		//byte bVlr = 128;
		short sVlr = 128;
		// mostrando o short convertido para byte
		System.out.println("isso vai dar perda na conversão: " + ( (byte) sVlr));
		byte bVlr = 127;
		bVlr++;// iria para 128, mas o limite do byte é -128 á 127.
		System.out.println("isso vai extrapolar o limite do byte"+ bVlr);
		short a, b, c;
		a = (short) 1 ;
		b = (short) 2 ;
		c = (short) (a + b) ;
		
	}

}
