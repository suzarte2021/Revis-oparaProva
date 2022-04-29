package ListaDuplamenteEncadeada;

public class Carregando {
	
//  Lista duplamente encadeada
//  Adicionar no inicio, adicionar no fim, 
//	  remover no inicio,remover no fim, listar
	
	public static void main(String[] args) {
		ListaDuplamente<Integer> lista = new ListaDuplamente<>();
		for (int i = 0; i < 5; i++) {
			lista.adicionarInicio(i);	
		}
		System.out.println("Adicionado no Inicio:");
		System.out.println(lista);
		for (int i = 0; i < 3; i++) {
			lista.removerInicio();	
		}
		System.out.println("Removendo no Inicio:");
		System.out.println(lista);
	for (int i = 0; i < 5; i++) {
		lista.adicionarInicio(i);	
	}
	
}
}
