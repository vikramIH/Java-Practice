package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.*;
class StringReverseTest {

	@Test
	public void test() {
		StringReverse obj = new StringReverse();
		String c = obj.reverse("Rajat");
		assertEquals("tajaR",c);	
	}

}