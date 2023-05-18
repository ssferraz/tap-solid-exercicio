package exercicio2;

public class Main {

	public static void main(String[] args) {
		
		IIdentificaService identificaService = new IdentificaService();
		IPermissaoService permissaoService = new PermissaoToken();

		ControleAcesso controle = new ControleAcesso(identificaService , permissaoService);

		String email = "admin@gmail.com";
		String senha = "admin";
		
		try {
			Usuario usuario = controle.login(new Usuario(email, senha), "Admin");
			System.out.println(usuario.getEmail());
			System.out.println(usuario.getSenha());
		} catch (AcessoProibidoException e) {
			System.out.println(e.getMessage());
		}
	}

}
