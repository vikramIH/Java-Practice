package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.*;

public class StringRepeatTest {

	@Test
	public void test() {
		
		StringRepeat obj = new StringRepeat();
		String smStr = obj.func( "Stackroute" , 2);
		assertEquals("Stackroutetete", smStr);
		
	}

}
