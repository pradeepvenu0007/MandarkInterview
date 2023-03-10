package mandark;

import org.junit.Test;

import com.interview.assesments.mandark.PerfectNumber;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PerfectNumberTest {
	@Test
	public void sampleInput1() {
		assertFalse(PerfectNumber.checkPerfectNumber(8));
	}

	@Test
	public void sampleInput2() {
		assertTrue(PerfectNumber.checkPerfectNumber(28));
	}

	@Test
	public void sampleInput3() {
		assertTrue(PerfectNumber.checkPerfectNumber(496));
	}

	@Test
	public void commonTest() {
		assertTrue(PerfectNumber.checkPerfectNumber(6));
		assertFalse(PerfectNumber.checkPerfectNumber(1));
		assertFalse(PerfectNumber.checkPerfectNumber(12345));
	}
}
