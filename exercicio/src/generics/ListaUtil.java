package generics;

import java.util.List;

public class ListaUtil {
	
	//Precisa de Cast
	public static Object getUltimo1(List<?> lista){
		return lista.get(lista.size() -1);
	}
	
	//Não precisa de cast
	public static <T> T getUltimo2(List<T> lista){
		return lista.get(lista.size() -1);
	}
	

}
