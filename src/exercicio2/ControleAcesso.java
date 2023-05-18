package exercicio2;

public class ControleAcesso {

	private IIdentificaService identificaService;
	private IPermissaoService permissao;

	public ControleAcesso(IIdentificaService identificaService, IPermissaoService permissaoService) {
		this.identificaService = identificaService;
		this.permissao = permissaoService;
	}

	public Usuario login(Usuario usuario, String cargo) throws AcessoProibidoException {
		if (identificaService.isValid(usuario) && permissao.hasHole(usuario, cargo)) {
			return usuario;
		}
		throw new AcessoProibidoException("Acesso Negado");
	}

	public IIdentificaService getIdentificaService() {
		return identificaService;
	}

	public IPermissaoService getPermissao() {
		return permissao;
	}

}
