package mandark;

import com.interview.assesments.mandark.EmpolyeeList;

import java.io.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeListTest {
	@Test
	public void testEmployeeDetails() throws IOException {
		EmpolyeeList.readAndWriteFile();
		BufferedReader managerReader = new BufferedReader(new FileReader("manager.csv"));
		assertEquals("Ruban,Manager,R&D", managerReader.readLine());
		managerReader.close();
		BufferedReader singleNameReader = new BufferedReader(new FileReader("single_name_employees.csv"));
		assertEquals("Ruban,Manager,R&D", singleNameReader.readLine());
		assertEquals("Aswath,Manager,Production", singleNameReader.readLine());
		assertEquals("Nazar,Team-Lead,Production", singleNameReader.readLine());
		assertNull(singleNameReader.readLine());
		singleNameReader.close();

	}
}