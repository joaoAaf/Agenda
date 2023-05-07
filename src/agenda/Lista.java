package agenda;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	private List<Contato> lista;

	public Lista() {
		this.lista = new ArrayList<Contato>();
	}
	
	public List<Contato> getLista() {
		return lista;
	}
}
