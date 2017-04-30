
public class Acesso {
	private String login;
	private String senha;

	public Acesso(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public Acesso() {
		this.login = "";
		this.senha = "";
	}

	public String toString() {
		return this.login + ".\n" + this.senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
