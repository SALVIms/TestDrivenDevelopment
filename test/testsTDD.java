
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class testsTDD {
	
	private TDD tdd;
	
	@Before
	public void SetUp(){
		tdd = new TDD();
	}
	
	@Test
	public void PUTGETDistintoPutconClaveValor() {
		tdd.put("Nombre", "Luis");
		assertEquals("Luis", tdd.get("Nombre"));
	}
	
/*	FALLO: por solucionar
	@Test(expected = TDDException.class)
	public void GETClaveNoExiste (){
		tdd.get("NoExisto");
	}
*/	
	
	@Test
	public void PUTLaClaveExisteReemplazarValorExistente() {
		tdd.put("Nombre", "Luis");
		tdd.put("Nombre", "Pepe");
		assertEquals("Pepe",tdd.get("Nombre"));
	}
}
