package calculator;

import junit.framework.TestCase;

public class CalTest extends TestCase{
	
	Sample cal=new Sample();
	
	public void add(){
		int a=10;
		int b=11;
		int expected=21;
		int actual= cal.add(a, b);
		assertEquals(expected, actual);
	}

}
