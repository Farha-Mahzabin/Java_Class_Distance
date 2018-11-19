package test;
import static org.junit.jupiter.api.Assertions.*;

import main.Sound;

import org.junit.jupiter.api.Test;

public class TestSound {

	@Test
	public void test() {
		Sound request = new Sound(7.2, 1100);
		double distance = request.distance();
		
		assertEquals(7920.0, distance);
	}

}
