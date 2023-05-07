package menus;

import java.util.Scanner;

import agenda.Agenda;
import agenda.Contato;

public class MenuAgenda {

	Scanner leia = new Scanner(System.in);

	public int recebeInt() {
        int numeroInt;
        while (true) {
            String numero = leia.nextLine();
            try {
                numeroInt = Integer.parseInt(numero);
                break;
            }
            catch (Exception e) {
                System.out.println("Número Inválido!");
                System.out.println("Digite um número:");
            }
        }
        return numeroInt;
    }
	
	public void menu() {

		int op = -1;
		Agenda agenda = new Agenda();

		while (op != 5) {
			System.out.println("\n-----------------------");
			System.out.println("|         Agenda        |");
			System.out.println("-------------------------");
			System.out.println("| 1 - Adicionar Contato |");
			System.out.println("| 2 - Excluir Contato   |");
			System.out.println("| 3 - Pesquisar Contato |");
			System.out.println("| 4 - Mostrar Contatos  |");
			System.out.println("| 5 - Sair              |");
			System.out.println("-------------------------");
			System.out.println("Selecione a opção desejada:");

			op = recebeInt();

			switch (op) {

			case 1:
				System.out.println("\n    Adicionar Contato    \n");
				System.out.println("Preencha os dados abaixo:");
				System.out.print("Nome: ");
				String nome = leia.nextLine();
				System.out.print("Quantos telefones deseja adicionar? ");
				int quantTel = recebeInt();
				String[] telefones = new String[quantTel];
				for (int i = 0; i < quantTel; i++) {
					System.out.print("Telefone "+(i+1)+": ");
					telefones[i] = leia.nextLine();
				}
				System.out.println("Data de Nascimento:");
				System.out.print("Dia: ");
				int dia = recebeInt();
				System.out.print("Mês: ");
				int mes = recebeInt();
				System.out.print("Ano: ");
				int ano = recebeInt();
				System.out.print("Email: ");
				String email = leia.nextLine();
				agenda.addContato(nome, telefones, dia, mes, ano, email);
				break;

			case 2:
				System.out.println("\n     Excluir Contato     \n");
				System.out.print("Nome do contato que deseja excluir:");
				String nomeContato = leia.nextLine();
				Contato contato = agenda.pesquisaContato(nomeContato);
				if (contato == null) {
					System.out.println("\nEste contato não existe!");
				}
				else {
					agenda.excluirContato(contato);
				}
				break;

			case 3:
				System.out.println("\n    Pesquisar Contato    \n");
				System.out.print("Nome do contato que deseja pesquisar:");
				String nomeContato1 = leia.nextLine();
				Contato contato1 = agenda.pesquisaContato(nomeContato1);
				if (contato1 == null) {
					System.out.println("\nEste contato não existe!");
				}
				else {
					System.out.println(contato1);;
				}
				break;

			case 4:
				System.out.println("\n         Agenda          \n");
				agenda.mostraAgenda();
				break;

			case 5:
				break;

			default:
				System.out.println("Digite um número de 1 a 5:");

			}
		}
	}
}