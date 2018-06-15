package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CheckCharacterTest {

	@Test
	public void test() {
		CheckCharacter obj = new CheckCharacter();
		String check = obj.func('a'); 
		assertEquals("A Small letter", check);
	}
	
	@Test
	public void test1() {
		CheckCharacter obj = new CheckCharacter();
		String check = obj.func('6'); 
		assertEquals("A Number", check);
	}
	
	@Test
	public void test2() {
		CheckCharacter obj = new CheckCharacter();
		String check = obj.func('G'); 
		assertEquals("A Capital letter", check);
	}
	
	@Test
	public void test3() {
		CheckCharacter obj = new CheckCharacter();
		String check = obj.func('$'); 
		assertEquals("A Special symbol", check);
	}
	
	

}
