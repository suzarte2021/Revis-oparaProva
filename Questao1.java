package ListaSimplesmenteEncadeada;

public class Questao1 {

	public static void main(String[] args) {

		ListaEncadeada<Integer> lista = new ListaEncadeada<>();

		for (int i = 0; i < 5; i++) {
			lista.adicionar(i);	
		}
		System.out.println("Adicionado no Inicio:");
		System.out.println(lista);
		for (int i = 0; i < 3; i++) {
			lista.removerInicio();	
		}
		System.out.println("Removendo no Inicio:");
		System.out.println(lista);
}
}