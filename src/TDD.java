import java.util.Hashtable;

public class TDD {
	private Hashtable<String, String> tabla = new Hashtable<String, String>();

	public void put(String clave, String valor) {
		tabla.put(clave, valor);
	}

	public String get(String clave) {
		String aux = " ";
		aux = tabla.get(clave);

		return aux;
	}
}
