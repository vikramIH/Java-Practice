package test;
import main.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TomAndJerryTest {

	@Test
	public void test() {
		TomAndJerry obj = new TomAndJerry();
	String c = obj.func(21);
	assertEquals("Tom",c);
	}
	
	@Test
	public void test1() {
		TomAndJerry obj = new TomAndJerry();
	String c = obj.func(29);
	assertEquals("Tom",c);
	}
	
	@Test
	public void test2() {
		TomAndJerry obj = new TomAndJerry();
	String c = obj.func(28);
	assertEquals("Jerry",c);
	}
	
	@Test
	public void test3() {
		TomAndJerry obj = new TomAndJerry();
	String c = obj.func(31);
	assertEquals("Invalid Entry",c);
	}
}