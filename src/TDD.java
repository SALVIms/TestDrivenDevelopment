import java.util.Hashtable;

public class TDD {
	private Hashtable<String, String> tabla = new Hashtable<String, String>();

	// crea una nueva entrada (un nuevo par) en la tabla. Si la clave existía
	// toma el nuevo valor.
	public void put(String clave, String valor) {
		if (tabla.contains(clave)) {
			tabla.replace(clave, valor);
		} else {
			tabla.put(clave, valor);
		}
	}

	// Busca la clave en la tabla y devuelve el valor asociado, si la clave no
	// existe eleva una excepción
	public String get(String clave) throws TDDException {
		String aux = " ";
		if (tabla.containsKey(clave)) {
			aux = tabla.get(clave);
		} else {
			throw new TDDException(tabla.toString());
		}
		return aux;
	}

	// Busca la clave en la tabla y devuelve el valor asociado, si la clave no
	// existe devuelve un valor por defecto
	public String getorelse(String clave, String valorDefecto) {
		String aux = "";
		if (tabla.containsKey(clave)) {
			aux = tabla.get(clave);
		} else {
			aux = tabla.get(valorDefecto);
		}
		return aux;
	}

	// Devuelve TRUE si la clave existe y FALSE en caso contrario
	public boolean containsKey(String clave) {
		return tabla.containsKey(clave) == true;
	}

	public boolean remove(String clave) {
		boolean encontrado = false;

		if (tabla.containsKey(clave)) {
			tabla.remove(clave);
			encontrado = true;
		}
		return encontrado;
	}

}
