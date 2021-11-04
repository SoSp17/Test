import static org.junit.Assert.*;


import org.junit.Test;

public class HelloWorldTest {


	@Test
	public void test() {
		int a=1;
		while(a<9) {
	
		assertEquals(a+a,HelloWorld.math(a));
		a=a+1;}
	}

	@Test
	public void test2() {
		int a=1;
		while(a<9) {
	
		assertEquals(a,HelloWorld.math(a));
		a=a+1;}
	}

}
