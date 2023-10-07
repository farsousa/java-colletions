package colletions.models;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	private List<Tarefa> listaTarefa;
	
	public ListaTarefa() {
		this.listaTarefa = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		this.listaTarefa.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasASerRemovidas = new ArrayList<>();
		for(Tarefa tarefa: this.listaTarefa) {
			if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasASerRemovidas.add(tarefa);
			}
		}
		this.listaTarefa.removeAll(tarefasASerRemovidas);
	}
	
	public int obterNumeroTotalTarefa() {
		return this.listaTarefa.size();
	}
	
	public void obterDescricoesTarefa() {
		System.out.println(this.listaTarefa);	
	}

}
