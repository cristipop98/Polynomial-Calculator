package tema;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class test3 {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Monom tst=new Monom(2, 2);
		Monom tst1=new Monom(4,1);
		int i=tst1.coef;
		int j=tst1.grad;
		Monom output=tst.derivare();
		int a=output.coef;
		int b=output.grad;
		assertEquals(b,j);
		assertEquals(a,i);
	}

}
