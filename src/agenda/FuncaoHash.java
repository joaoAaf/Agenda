package agenda;

public class FuncaoHash {
	
	public Integer definePosicao(String nome) {
		
		if (nome.equals("")) {
			nome = " ";
		}
		
		nome = nome.toLowerCase();
		int posicao;
		
		int numChar = (int) nome.charAt(0);
		
		if ((122-numChar)%2!=0) {
			numChar += 1;
		}
		
		if (numChar < 97 || numChar > 122) {
			numChar = 122;
		}
		
		posicao = 12 - (61-(numChar/2));
		
		return posicao;
	}
	
	
}
