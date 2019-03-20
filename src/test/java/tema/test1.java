package tema;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void test() {
		Monom m1=new Monom(3,4);
		Monom m2=new Monom(5,4);
		Monom m3=new Monom(8,4);
		int i=m3.coef;
		int j=m3.grad;
		Monom output=m1.adunare(m2);
		int a=output.coef;
		int b=output.grad;
		assertEquals(i,a);
		assertEquals(j,b);
	}

}
