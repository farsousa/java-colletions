package colletions;

import colletions.models.ListaTarefa;

public class ListaTarefaApplication {
	
	public static void main(String [] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("Iniciando o objeto de lista de tarefas");
		System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTotalTarefa());
		System.out.println();
		
		System.out.println("Adicionando  tarefas");
		listaTarefa.adicionarTarefa("Estudar Matem�tica");
		listaTarefa.adicionarTarefa("Fazer Almo�o");
		listaTarefa.adicionarTarefa("Estudar Geografia");
		listaTarefa.adicionarTarefa("Estudar Matem�tica");
		listaTarefa.adicionarTarefa("Estudar Portugu�s");
		System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTotalTarefa());
		System.out.println();
		
		
		System.out.println("Exibindo tarefas");
		listaTarefa.obterDescricoesTarefa();
		System.out.println();
		
		System.out.println("Removendo tarefas");
		listaTarefa.removerTarefa("Estudar Matem�tica");
		System.out.println("Total de tarefas: " + listaTarefa.obterNumeroTotalTarefa());
		
		
		
	}

}
