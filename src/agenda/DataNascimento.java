package agenda;

public class DataNascimento {

	private Integer dia;
	private Integer mes;
	private Integer ano;
	
	public DataNascimento(Integer dia, Integer mes, Integer ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
}
