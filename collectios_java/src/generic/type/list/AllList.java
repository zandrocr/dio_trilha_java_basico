package generic.type.list;

import generic.type.list.CatalogoLivros.CatalogoLivros;
import generic.type.list.ListaTarefas.ListTarefa;
import generic.type.list.Ordenacao.ListaPessoas;

public class AllList {
	public void ListaTarefas() {
		// List de tarefa
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
		
		//Catalogo de livros
		
	}
	public void CatalogoLivro() {
		CatalogoLivros list = new CatalogoLivros();

		list.adicionarLivro("Livro1", "Autor1", 1852);
		list.adicionarLivro("Livro3", "Autor3", 1882);
		list.adicionarLivro("Livro5", "Autor5", 1952);
		list.adicionarLivro("Livro2", "Autor2", 2052);
		list.adicionarLivro("Livro2", "Autor2", 2053);
		
		System.out.println(list.pesquisarPorAutor("Autor2"));
		
		System.out.println(list.pesquisarPorIntervaloAnos(1850, 1883));
		
		System.out.println(list.pesquisarPorTitulo("Livro2"));
		
	}

	public void ListaPessoas(){
		ListaPessoas list = new ListaPessoas();

		list.adicionarPessoa("Pessoa1", 25, 1.58);
		list.adicionarPessoa("Pessoa2", 55, 1.63);
		list.adicionarPessoa("Pessoa3", 95, 1.97);
		list.adicionarPessoa("Pessoa4", 29, 1.87);

		System.out.println(list.ordenadoIdade());
		System.out.println(list.ordenarPorAltura());
			}
}
