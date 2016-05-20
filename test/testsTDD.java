import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testsTDD {

	private TDD tdd;

	@Before
	public void SetUp() {
		tdd = new TDD();
	}

	@Test
	public void PUTGETDistintoPutconClaveValor() {
		tdd.put("Nombre", "Luis");
		assertEquals("Luis", tdd.get("Nombre"));
	}

	@Test
	public void PUTGETconValorNumeros() {
		tdd.put("DNI", "1234");
		assertEquals("1234", tdd.get("DNI"));
	}

	@Test
	public void PUTGETDistintoPutconValorVacio() {
		tdd.put("pais", "");
		assertEquals("", tdd.get("pais"));
	}

	@Test
	public void PUTGETDosClaveValorDistintos() {
		tdd.put("Nombre", "Pepe");
		assertEquals("Pepe", tdd.get("Nombre"));
		tdd.put("Apellido", "Martin");
		assertEquals("Martin", tdd.get("Apellido"));
	}

	@Test
	public void PUTGETDosClavesDiferentesConDosValoresIguales() {
		tdd.put("Nombre", "Pepe");
		assertEquals("Pepe", tdd.get("Nombre"));
		tdd.put("Apellido", "Pepe");
		assertEquals("Pepe", tdd.get("Apellido"));
	}

	@Test
	public void PUTLaClaveExisteReemplazaValorExistente() {
		tdd.put("Nombre", "Luis");
		tdd.put("Nombre", "Pepe");
		assertEquals("Pepe", tdd.get("Nombre"));
	}

	@Test(expected = TDDException.class)
	public void GETClaveNoExiste() {
		tdd.get("NoExisto");
	}

}
