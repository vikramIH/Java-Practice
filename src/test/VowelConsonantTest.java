package test;

import static org.junit.jupiter.api.Assertions.*;
import main.*;

import org.junit.jupiter.api.Test;

class VowelConsonantTest {

	@Test
	public void test() {
		VowelConsonant obj = new VowelConsonant();
		String[] res = obj.func("Rajat12$");
		assertEquals("c",res[0]);
		assertEquals("v",res[1]);
		assertEquals("c",res[2]);
		assertEquals("v",res[3]);
		assertEquals("c",res[4]);
		assertEquals("i",res[5]);
		assertEquals("i",res[6]);
		assertEquals("i",res[7]);
    }
}
