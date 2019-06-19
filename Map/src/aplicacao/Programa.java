package aplicacao;

import java.util.HashMap;
import java.util.Map;

import entities.Produto;

public class Programa {
	public static void main(String args[]) {
		Map<Produto, Double> stock = new HashMap<>();

		Produto p1 = new Produto ("TV", 900.00);
		Produto p2 = new Produto ("Notebook", 1600.00);
		Produto p3 = new Produto ("Tablet", 2000.00);
		
		stock.put(p1, 10000.00);
		stock.put(p2, 20000.00);
		stock.put(p3, 15000.00);
		
		Produto ps = new Produto ("TV", 900.00);
		

		System.out.println("Contem a chave 'ps'? " + stock.containsKey(ps)); //Verifica se contem uma chave com nome 'fone'
		
	}

}
