package exercicio2;

public class AcessoProibidoException extends Exception {

	private static final long serialVersionUID = 8340207717028691032L;
	
	public AcessoProibidoException(String mensagem) {
		super(mensagem);
	}

}
