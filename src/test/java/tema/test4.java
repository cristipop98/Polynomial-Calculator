package tema;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class test4 {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Monom m1=new Monom(3,4);
		Monom m2=new Monom(5,4);
		Monom m3=new Monom(-2,4);
		int i=m3.coef;
		int j=m3.grad;
		Monom output=m1.scadere(m2);
		int a=output.coef;
		int b=output.grad;
		assertEquals(i,a);
		assertEquals(j,b);
	}

}
