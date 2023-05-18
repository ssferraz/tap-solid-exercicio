package exercicio1;

public class HashService implements IHashService {

	@Override
	public String getHash(String senha) {
		return senha.concat("criptografada") ;
	}

}
