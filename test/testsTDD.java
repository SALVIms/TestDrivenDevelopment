
import static org.junit.Assert.*;

import org.junit.Test;


public class testsTDD {
	
	private TDD tdd;
	
	@Test
	public void DistintoPutconClaveValor()  {
		tdd = new TDD();
		tdd.put("Nombre", "Luis");
		assertEquals("Luis", tdd.get("Nombre"));
	}

}
