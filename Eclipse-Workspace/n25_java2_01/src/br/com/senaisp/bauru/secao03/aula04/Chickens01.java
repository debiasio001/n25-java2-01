package br.com.senaisp.bauru.secao03.aula04;

public class Chickens01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalEggs = 0;
		int  eggsPerChicken = 4/*5*/, chickenCount = 8 /*3*/;
		//1º dia 
		totalEggs += eggsPerChicken * chickenCount;// 32
		//2° dia -9
		totalEggs += eggsPerChicken * ++chickenCount;//32+36 //ganhou uma galinha
		//3° dia 
		chickenCount/=2;// animal come metade das galinhas -4
		totalEggs += eggsPerChicken * chickenCount;//32+36+16
		//imprimir o total
		System.out.println(totalEggs); //84
		
		
	}

}
