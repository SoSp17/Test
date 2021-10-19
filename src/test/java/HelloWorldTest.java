import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class HelloWorldTest {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int a=1;
		while(a<9) {
	
		assertEquals(a+a,HelloWorld.Math(a));
		a=a+1;}
	}

}
