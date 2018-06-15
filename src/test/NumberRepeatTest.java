package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.NumberRepeat;

public class NumberRepeatTest {

	@Test
	public void test() {
		NumberRepeat obj = new NumberRepeat();
		int num = obj.numRepeat(3);
		assertEquals(122333,num);
	}
	
	@Test
	public void test1() {
		NumberRepeat obj = new NumberRepeat();
		int num = obj.numRepeat(0);
		assertEquals(0,num);
	}

}
