
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
	public void DistintoPutconClaveValor() {
		tdd.put("Nombre", "Luis");
		assertEquals("Luis", tdd.get("Nombre"));
	}
	
	@Test(expected = TDDException.class)
	public void GETClaveNoExiste (){
		tdd.get("NoExisto");
	}
	
	

}
