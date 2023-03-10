package mandark;

import java.io.*;

import org.junit.Test;

import com.interview.assesments.mandark.Manhattan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ManhattanTest {
	@Test
	public void sampleInput1() {
		int[] startPoint = { 0, 0 };
		int[] endPoint = Manhattan.calculateEndPoint(startPoint, "NNNNEEENE");
		assertEquals(Manhattan.calculateDistance(startPoint, endPoint), 6.4, 0.01);
	}

	@Test
	public void sampleInput2() {
		int[] startPoint = { 0, 0 };
		int[] endPoint = Manhattan.calculateEndPoint(startPoint, "NEWS");
		assertEquals(Manhattan.calculateDistance(startPoint, endPoint), 0, 0.01);
	}

	@Test
	public void sampleInput3() {
		int[] startPoint = { 0, 0 };
		int[] endPoint = Manhattan.calculateEndPoint(startPoint, "EEEEEEEEEE");
		assertEquals(Manhattan.calculateDistance(startPoint, endPoint), 10.0, 0.1);
	}
}
