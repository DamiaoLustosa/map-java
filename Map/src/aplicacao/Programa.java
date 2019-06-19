package aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class Programa {
	public static void main(String args[]) {
		Map<String, String> cook = new TreeMap<>();

		cook.put("Usuario", "Maria");
		cook.put("email", "maria@gmail.com");
		cook.put("fone", "99914253");
		cook.put("endereco", "rua D");

		cook.remove("fone");
		
		cook.put("fone", "99914856");	//Como o map não aceita repetição de chaves, ele vai sobrescrever o valo da chave já existente
		

		System.out.println("Todos os Cookies: ");
		for (String key : cook.keySet()) {
			System.out.println(key + ": " + cook.get(key));

		}
		
		System.out.println("Contem a chave fone? " + cook.containsKey("fone")); //Verifica se contem uma chave com nome 'fone'
		System.out.println("Número do fone? " + cook.get("fone"));	//get Acessa o valor da chave passada
		System.out.println("Tamanho do Map: " + cook.size());	//Size retorna o tamanho do Map
	}

}
