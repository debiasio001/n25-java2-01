package br.com.senaisp.bauru.ingrid.test;

import java.sql.SQLException;

import br.com.senaisp.bauru.ingrid.classes.ConectorBancoDados;

public class Produto {
	private int id;
	private String descricao;
	private double saldo;
	private double preco;
	private ConectorBancoDados conn;
	//constructor
	public Produto(String decricao, double saldo, double preco) throws SQLException {
		this.descricao = descricao;
		this.saldo = saldo;
		this.preco = preco;
		conn = ConectorBancoDados.getInstancia();
	}
}
