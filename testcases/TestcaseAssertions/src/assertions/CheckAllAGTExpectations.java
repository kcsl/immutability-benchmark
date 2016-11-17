package assertions;

import java.io.File;

public class CheckAllAGTExpectations {

	public static void main(String[] args) {
		File agtTests = new File("../../testcases/binary/AGT");
		System.out.println("Test Case,Expectation,Result,Expectation Satisified");
		for(File agtTest : agtTests.listFiles()){
			CheckAGTExpectations.checkExpectation(agtTest.getAbsolutePath());
		}
	}

}
