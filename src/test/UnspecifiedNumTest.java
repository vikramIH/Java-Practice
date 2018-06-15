package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.UnspecifiedNumberSum;

public class UnspecifiedNumTest {

	@Test
	public void test() {
		UnspecifiedNumberSum obj = new UnspecifiedNumberSum();
		int check = obj.func(3, 45, 23, -12);
		assertEquals(56, check);
	}

}
