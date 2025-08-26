package br.com.senaisp.bauru.secao08.aula15;

public class PessoaJuridica extends Pessoa {
	public PessoaJuridica() {
		super(); //usando o constructor da classe pai
		setTipoPessoa('J');
	}//fechando contructor
	//constructor com parametrôs
	public PessoaJuridica (String nom, String doc,
			String ende, String dtNas) throws DocumentoException, EnderecoExpception {
		super(nom,doc,ende,dtNas);
		setTipoPessoa('J');//usando o constructor da classe pai 
	}
	@Override
	protected boolean isDocumentovalido(String documento2) {
		return documento2.length()==18 || documento2.length()==14;
	}
}
