package agenda;

import java.util.Comparator;

public class Vetor {

	private Lista[] vetor;

	public Vetor() {
		this.vetor = new Lista[13];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = new Lista();
		}
	}
	
	public void addLista(Integer posicao, Contato contato) {
		vetor[posicao].getLista().add(contato);
		reorganize(posicao,contato);
		posicaoLista(posicao, contato);
	}
	
	public void posicaoLista(Integer posicaoVetor, Contato contato) {
		contato.setPosicaoVetor(posicaoVetor);
	}
	
	public void reorganize(Integer posicaoVetor, Contato contato) {
		vetor[posicaoVetor].getLista().sort(Comparator.comparing(Contato::getNome));
	}
	
	public Integer indiceLista(Integer posicaoVetor, Contato contato) {
		return vetor[posicaoVetor].getLista().indexOf(contato);
	}
	
	public Boolean listaVazia(int posicao) {
		return vetor[posicao].getLista().isEmpty();
	}
	
	public  Integer tamanhoLista(int posicao) {
		return vetor[posicao].getLista().size();
	}
	
	public Contato monstraContato(int posicaoVetor, int posicaoLista) {
		return vetor[posicaoVetor].getLista().get(posicaoLista);
	}
	
	public void removerContato(Contato contato) {
		vetor[contato.getPosicaoVetor()].getLista().remove(contato);
	}

	public Lista[] getVetor() {
		return vetor;
	}
}