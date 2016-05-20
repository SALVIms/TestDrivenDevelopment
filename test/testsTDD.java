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
	public void PutYGetDistintoPutconClaveValor() throws TDDException {
		tdd.put("Nombre", "Luis");
		assertEquals("Luis", tdd.get("Nombre"));
	}

	@Test
	public void PutYGetConValorNumeros() throws TDDException {
		tdd.put("DNI", "1234");
		assertEquals("1234", tdd.get("DNI"));
	}

	@Test
	public void PutYGetDistintoPutconValorVacio() throws TDDException {
		tdd.put("pais", "");
		assertEquals("", tdd.get("pais"));
	}

	@Test
	public void PutYGetDosClaveValorDistintos() throws TDDException {
		tdd.put("Nombre", "Pepe");
		assertEquals("Pepe", tdd.get("Nombre"));
		tdd.put("Apellido", "Martin");
		assertEquals("Martin", tdd.get("Apellido"));
	}

	@Test
	public void PutGetDosClavesDiferentesConDosValoresIguales()
			throws TDDException {
		tdd.put("Nombre", "Pepe");
		assertEquals("Pepe", tdd.get("Nombre"));
		tdd.put("Apellido", "Pepe");
		assertEquals("Pepe", tdd.get("Apellido"));
	}

	@Test
	public void PutLaClaveExisteReemplazaValorExistente() throws TDDException {
		tdd.put("Nombre", "Luis");
		tdd.put("Nombre", "Pepe");
		assertEquals("Pepe", tdd.get("Nombre"));
	}

	@Test(expected = TDDException.class)
	public void GetClaveNoExiste() throws TDDException {
		tdd.put("Nombre", "Luis");
		tdd.get("NoExisto");
	}

	@Test
	public void GetOrElseBuscaLaClaveYLaEncuentra() {
		tdd.put("Nombre", "Luis");
		assertEquals("Luis", tdd.getorelse("Nombre", "valorPorDefecto"));
	}

	@Test
	public void GetOrElseBuscaLaClaveYnoExisteSacaValorDefault() {
		tdd.put("NoNombre", "valor");
		assertEquals("valorDefecto", tdd.getorelse("Nombre", "valorDefecto"));
	}

	@Test
	public void ContainsKeyBuscaLaClaveYlaEncuetraDevuelveTRUE()
			throws Exception {
		tdd.put("Nombre", "Luis");
		assertEquals(true, tdd.containsKey("Nombre"));
	}

	@Test
	public void ContainsKeyBuscaLaClaveYNOlaEncuetraDevuelveFALSE()
			throws Exception {
		tdd.put("NoNombre", "valor");
		assertEquals(false, tdd.containsKey("Nombre"));
	}

	@Test
	public void RemoveBorraLaClaveYDevuelveTRUEPorqueLaEncuentra() {
		tdd.put("Nombre", "Luis");
		assertEquals(true, tdd.remove("Nombre"));
	}

	public void RemoveBorraLaClaveYDevuelveFALSEPorqueNoLaEncuentra() {
		tdd.put("NoNombre", "valor");
		assertEquals(false, tdd.remove("Nombre"));
	}
}
