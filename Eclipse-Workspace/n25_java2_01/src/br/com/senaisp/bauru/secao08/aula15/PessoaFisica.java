package br.com.senaisp.bauru.secao08.aula15;

public class PessoaFisica extends Pessoa {
	public PessoaFisica() {
		super(); //usando o constructor da classe pai
		setTipoPessoa('F');
	}//fechando contructor
	//constructor com parametrôs
	public PessoaFisica (String nom, String doc,
			String ende, String dtNas) throws DocumentoException, EnderecoExpception {
		super(nom,doc,ende,dtNas);
		setTipoPessoa('F');//usando o constructor da classe pai 
	}
	@Override
	protected boolean isDocumentovalido(String documento2) {
		return documento2.length()==14 || documento2.length()==11;
	}
	
}
