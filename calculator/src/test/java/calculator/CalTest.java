package calculator;

import junit.framework.TestCase;

public class CalTest extends TestCase{
	
	Sample cal=new Sample();
	
	public void add(){
		int a=10;
		int b=10;
		
		int expected=20;
		
		int actual= cal.add(a, b);
		
		assertEquals(expected, actual);
		
		
	}
	

}
