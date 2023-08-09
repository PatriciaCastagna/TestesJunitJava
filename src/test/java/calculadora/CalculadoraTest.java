package calculadora;


import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class CalculadoraTest {
	
	//calc seria um "ponteiro" de referencia para calculadora
	
	Calculadora calc = new Calculadora();


	@Test
	public void testSoma() {
				
		//vamos usar junit através do método assertEquals
		
		assertEquals(15, calc.soma(10, 5));
		
	}
	
	
	@Test	
	public void testSubtrair() {
		
		//vamos usar junit através do método assertEquals
		
		assertEquals(5, calc.subtrair(10, 5));
		
	}
	
	@Test	
	public void testMult() {
		
		//vamos usar junit através do método assertEquals
		
		assertEquals(25, calc.mult(5, 5));
		
	}
	
	@Test	
	public void testDividir() {
		
		//vamos usar junit através do método assertEquals
		
		assertEquals(10, calc.dividir(20, 2));
		
	}
	
	
	
	

}
