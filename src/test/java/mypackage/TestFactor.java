package mypackage;

import junit.framework.TestCase;

public class TestFactor

extends TestCase
{
	  public void testfactor1()
	    {
	        assertTrue(  Factor.factor(3) == 6  );    
	    }
	    public void testfactor2()
	    {     
	        assertTrue(  Factor.factor(1) == 1  );
	    }
	    public void testfactor3()
	    {
	        assertTrue(  Factor.factor(0) == 1  );
	    }
	
}
