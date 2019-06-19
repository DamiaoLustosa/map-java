package aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class Programa {
	public static void main (String args[]) {
		Map<String, String> cook = new TreeMap<>();
		
		cook.put("Usuario","Maria");
		cook.put("email","maria@gmail.com");
		cook.put("fone","99914253");
		cook.put("endereco","rua D");
		
		cook.remove("fone");
		
		System.out.println("Todos os Cookies: ");
		for (String key : cook.keySet()){
			System.out.println(key + ": " + cook.get(key));
			
			
		}
		
		
		
		
	}

}
