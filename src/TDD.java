import java.util.Hashtable;

public class TDD {
	private Hashtable<String, String> tabla = new Hashtable<String, String>();

	// crea una nueva entrada (un nuevo par) en la tabla. Si la clave existía
	// toma el nuevo valor.
	public void put(String clave, String valor) {
		tabla.put(clave, valor);
	}

	// Busca la clave en la tabla y devuelve el valor asociado, si la clave no
	// existe eleva una excepción
	public String get(String clave) {
		String aux = " ";
		if (tabla.containsKey(clave)) {
			aux = tabla.get(clave);
		} else {
			try {
				throw new TDDException(tabla.toString()); //Fallo TDDException.java
			} catch (TDDException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return aux;
	}
}
