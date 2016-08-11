package calculator;

import org.junit.Assert;



public class CalTest{
	
	Sample cal=new Sample();
	
	public void add(){
		int a=10;
		int b=10;
		
		int expected=20;
		
		int actual= cal.add(a, b);
		
		Assert.assertEquals(expected, actual);
		
		
	}
	

}
