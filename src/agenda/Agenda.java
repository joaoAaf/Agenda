package agenda;

public class Agenda {
	
	private Vetor vetor;
	
	public Agenda() {
		this.vetor = new Vetor();
	}
	
	public void addContato(String nome, String[] telefones, Integer dia, Integer mes, Integer ano, String email) {
		FuncaoHash hash = new FuncaoHash();
		Contato contato = new Contato(nome, telefones, dia, mes, ano, email);
		Integer posicao = hash.definePosicao(nome);
		vetor.addLista(posicao, contato);
	}
	
	public void mostraAgenda() {
		for (int i = 0; i < vetor.getVetor().length; i++) {
			if (vetor.listaVazia(i)) {}
			else {
				for (int j = 0; j < vetor.tamanhoLista(i);j++) {
					System.out.println(vetor.monstraContato(i, j));
				}
			}
		}
	}
	
	public Contato pesquisaContato (String nome) {
		FuncaoHash hash = new FuncaoHash();
		Integer posicao = hash.definePosicao(nome);
		Contato contato = null;
		nome = nome.toLowerCase();
		for (int i = 0; i < vetor.tamanhoLista(posicao); i++) {
			String nomeAgenda = vetor.monstraContato(posicao, i).getNome().toLowerCase();
			if (nomeAgenda.equals(nome)) {
				contato = vetor.monstraContato(posicao, i);
				break;
			}
		}
		return contato;
	}
	
	public void excluirContato (Contato contato) {
		vetor.removerContato(contato);
	}
	
}
