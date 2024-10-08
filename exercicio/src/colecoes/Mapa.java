package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();
		// put adiciona e substitui
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());

		// pega a chave do mapa
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());// pega os valores do mapa
		System.out.println(usuarios.entrySet());// chave e valor

		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));

		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "Gui"));

		for (int chaves : usuarios.keySet()) {
			System.out.println(chaves);
		}

		for (String valores : usuarios.values()) {
			System.out.println(valores);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()){
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}

	}

}
