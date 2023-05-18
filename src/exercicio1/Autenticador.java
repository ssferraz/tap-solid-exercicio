package exercicio1;

public class Autenticador {

	private IUsuarioRepository usuarioRepository;
	private IHashService hashService;
	
	public Autenticador(IUsuarioRepository usuarioRepository, IHashService hashService) {
		this.usuarioRepository = usuarioRepository;
		this.hashService = hashService;
	}
	
	public boolean autenticarUsuario(String email, String senha) {
		Usuario usuario;
		try {
			usuario = usuarioRepository.getUsuarioPorEmail(email);
		} catch (Exception e) {
			return false;
		}

        if (usuario == null) {
            return false;
        }

        String senhaHasheada = hashService.getHash(senha);

        if (!usuario.getHashSenha().equals(senhaHasheada)) {
            return false;
        }

        usuario.setAutenticado(true);
        usuarioRepository.registraLogin(usuario);
        return true;
	}

	public IUsuarioRepository getUsuarioRepository() {
		return usuarioRepository;
	}

	public IHashService getHashService() {
		return hashService;
	}
	
	
}
