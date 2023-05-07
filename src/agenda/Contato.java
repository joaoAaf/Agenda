package agenda;

public class Contato {

	private String nome;
	private String[] telefones;
	private DataNascimento data;
	private String email;
	private Integer posicaoVetor;
	
	public Contato(String nome, String[] telefones, Integer dia, Integer mes, Integer ano, String email) {
		this.nome = nome;
		this.telefones = telefones;
		this.data = new DataNascimento(dia, mes, ano);
		this.email = email;
	}
	
	public String mostraTelefones() {
		String tels = "";
		for(int i=0;i<telefones.length;i++) {
			tels += "Telefone "+(i+1)+": "+telefones[i]+"\n";
		}
		return tels;
	}

	public String toString() {
		return "Nome: " + nome + "\n" + mostraTelefones() + "Data de Nascimento: " + data + "\nEmail: " + email + "\n";
	}

	public String getNome() {
		return nome;
	}

	public String[] getTelefones() {
		return telefones;
	}

	public DataNascimento getData() {
		return data;
	}

	public String getEmail() {
		return email;
	}

	public Integer getPosicaoVetor() {
		return posicaoVetor;
	}

	public void setPosicaoVetor(Integer posicaoVetor) {
		this.posicaoVetor = posicaoVetor;
	}
	
}
