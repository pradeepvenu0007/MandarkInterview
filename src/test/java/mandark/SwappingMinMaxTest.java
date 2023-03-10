package mandark;

import org.junit.Test;

import com.interview.assesments.mandark.SwappingMinMax;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SwappingMinMaxTest {
	@Test
	public void sampleInput1() {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 6, 5, 1, 2));
		ArrayList<Integer> b = new ArrayList<>(Arrays.asList(3, 4, 3, 2, 2, 5));
		SwappingMinMax.swapList(a, b);
		assertEquals(SwappingMinMax.maxProduct(a, b), 18);
	}
	@Test
	public void sampleInput2() {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(8,7,9,6,5,6,6,5,6,4,6,7,8,5,4,3,2,1,4,5,6,7,8,7,8));
		ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2,4,5,6,7,6,7,8,9,8,7,6,7,6,5,4,3,2,3,4,5,5,5,4,5));
		SwappingMinMax.swapList(a, b);
		assertEquals(SwappingMinMax.maxProduct(a, b), 63);
	}
	@Test
	public void sampleInput3() {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,2,3,4,5,3,5,6,7,8));
		ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2,1,5,3,4,6,4,3,2,3,1,2));
		SwappingMinMax.swapList(a, b);
		assertEquals(SwappingMinMax.maxProduct(a, b), 32);
	}
}
