package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.*;

public class GuessNumberTest {

	@Test
	public void test() {
		GuessNumber obj = new GuessNumber();
		boolean check = obj.func(34, Math.random()*100);
		assertEquals(false ,check);
	}

}
