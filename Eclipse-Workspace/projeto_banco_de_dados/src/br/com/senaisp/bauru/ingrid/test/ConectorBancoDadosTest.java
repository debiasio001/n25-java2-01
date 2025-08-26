package br.com.senaisp.bauru.ingrid.test;

import br.com.senaisp.bauru.ingrid.classes.ConectorBancoDados;

public class ConectorBancoDadosTest {

	public static void main(String[] args) {
		ConectorBancoDados conn = ConectorBancoDados.getInstancia();
		System.out.println(conn.getConnStr());
		ConectorBancoDados conn2 = ConectorBancoDados.getInstancia();
		System.out.println(conn2.getConnStr());
		System.out.println(conn);
		System.out.println(conn2);
	}

}
