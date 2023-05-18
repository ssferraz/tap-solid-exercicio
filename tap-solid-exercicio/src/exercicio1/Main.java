package exercicio1;

public class Main {
	public static void main(String[] args) {
		IUsuarioRepository usuarioRepository = new UsuarioRepository();
		IHashService hashService = new HashService();
		
		Autenticador autenticador = new Autenticador(usuarioRepository, hashService);
		
		String email = "admin@gmail.com";
		String senha = "admin";
		
		boolean result = autenticador.autenticarUsuario(email, senha);
		
		System.out.println(result);
	}
}
