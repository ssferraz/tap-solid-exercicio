package exercicio1;

public interface IUsuarioRepository {

	public Usuario getUsuarioPorEmail(String email) throws Exception;
	public void registraLogin(Usuario usuario);
}
