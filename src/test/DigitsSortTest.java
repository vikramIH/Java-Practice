package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import main.*;
import org.junit.jupiter.api.Test;
class DigitsSorttest {
@Test
	public void test() {
	DigitsSort obj = new DigitsSort();
		int[] n = obj.sort(345231);
		assertEquals(5,n[0]);
		assertEquals(4,n[1]);
		assertEquals(3,n[2]);
		assertEquals(3,n[3]);
		assertEquals(2,n[4]);
		assertEquals(1,n[5]);
		
	}
	
	@Test
	public void test1() {
		DigitsSort obj = new DigitsSort();
		boolean x = obj.numberOrNot("45");
		assertEquals(true,x);
		
	}

}