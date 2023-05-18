package exercicio1;

public class Usuario {
	private String email;
	private String hashSenha;
	private boolean autenticado;
	
	public Usuario(String email, String hashSenha, boolean autenticado) {
		this.email = email;
		this.hashSenha = hashSenha;
		this.autenticado = autenticado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHashSenha() {
		return hashSenha + "criptografada";
	}

	public void setHashSenha(String hashSenha) {
		this.hashSenha = hashSenha;
	}

	public boolean isAutenticado() {
		return autenticado;
	}

	public void setAutenticado(boolean autenticado) {
		this.autenticado = autenticado;
	}

}
