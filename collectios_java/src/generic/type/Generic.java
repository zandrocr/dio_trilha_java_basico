package generic.type;

import generic.type.list.OperacoesBasicas.ListTarefa;

public class Generic {
	public static void main(String[] args) {
		//List
		ListTarefa list = new ListTarefa();
		System.out.println("Número tota de tarefas: " + list.obterNumeroTotalTarefas());
		
		list.adicionarTarefa("Tarefa 1");
		list.adicionarTarefa("Tarefa 1");
		list.adicionarTarefa("Tarefa 2");
		list.adicionarTarefa("Tarefa 3");
		System.out.println("Número tota de tarefas: " + list.obterNumeroTotalTarefas());
		
		list.removerTarefa("Tarefa 1");
		System.out.println("Número tota de tarefas: " + list.obterNumeroTotalTarefas());
		
		list.obterDescricoesTarefas();
	}
}
