import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Tests {

	@Test
	public void AddPos() {
		Calc test = new Calc();
		float output = test.add(5,6);
		assertEquals(11,output);
	}
	@Test
	public void AddtoZero() {
		Calc test = new Calc();
		float output = test.add(5,0);
		assertEquals(5,output);
	}
	@Test
	public void AddNeg() {
		Calc test = new Calc();
		float output = test.add(5,-7);
		assertEquals(-2,output);
	}
	@Test
	public void DividePos() {
		Calc test = new Calc();
		float output = test.divide(12,6);
		assertEquals(2,output);
	}
	@Test
	public void DivideOZero() {
		Calc test = new Calc();
		float output = test.divide(5,0);
		assertEquals(-1,output);
	}
	@Test
	public void DivideZeroO() {
		Calc test = new Calc();
		float output = test.divide(0,5);
		assertEquals(0,output);
	}
	@Test
	public void DivideZeroOZero() {
		Calc test = new Calc();
		float output = test.divide(0,0);
		assertEquals(-1,output);
	}
	@Test
	public void DivideONeg() {
		Calc test = new Calc();
		float output = test.divide(12,-6);
		assertEquals(-2,output);
	}
	@Test
	public void DivideNegO() {
		Calc test = new Calc();
		float output = test.divide(-12,6);
		assertEquals(-2,output);
	}
	@Test
	public void DivideNegONeg() {
		Calc test = new Calc();
		float output = test.divide(-12,-6);
		assertEquals(2,output);
	}

}
