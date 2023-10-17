package Shopping;

import Shopping.Produto;

public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto (1234, "Creme", 40);
		System.out.println("Produto: ");
		System.out.println("Id: " + produto.getId());
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Preço: " + produto.getPreco());
		
		Sorvete sorvete = new Sorvete (1235, "Morango", 2, 15);
		System.out.println("\nSorvete: ");
		System.out.println("Id: " + sorvete.getId());
		System.out.println("Nome: " + sorvete.getNome());
		System.out.println("Preço: " + sorvete.getPreco());
		System.out.println("Tempo Adequado: " + sorvete.getTempAdequada());
		
		Camisa camisa = new Camisa (1236, "Tommy", 200, "Branca", "Algodão", "M");
		System.out.println("\nCamisa: ");
		System.out.println("Id: " + camisa.getId());
		System.out.println("Nome: " + camisa.getNome());
		System.out.println("Preço: " + camisa.getPreco());
		System.out.println("Cor: " + camisa.getCor());
		System.out.println("Tecido: " + camisa.getTecido());
		System.out.println("Tamanho: " + camisa.getTamanho());

	}

}
