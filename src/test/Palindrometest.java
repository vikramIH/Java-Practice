package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.*;
class Palindrometest {

@Test
	public 	void test() {
	Palindrome obj = new Palindrome();
	int x = obj.func(1331);
	assertEquals(1331,x);
	}

}
