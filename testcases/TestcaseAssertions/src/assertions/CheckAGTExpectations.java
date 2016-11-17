package assertions;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckAGTExpectations {

	public static void main(String[] args){
		String testBinary = "";
		if(args.length == 0){
			// debug
			testBinary = "/Users/benjholla/Desktop/STAC/git/immutability-benchmark/testcases/binary/AGT/AGT001_FinalObject_ObjectInstanceVariable.jar";
		} else {
			testBinary = args[0];
		}

		checkExpectations(testBinary);
	}
	
	public static String checkAnnotation(File sourceFile, String annotation){
		try {
			int numAnnotations = 0;
			boolean fieldAnnotatedCorrected = annotation.equals("DEPENDS");
			
			Scanner scanner = new Scanner(sourceFile);
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				if(line.contains("import annotations.")){
					numAnnotations++;
				}
				if(line.contains("import annotations.") && line.contains(".*;")){
					numAnnotations = Integer.MAX_VALUE;
					break;
				}
				
				if(line.contains("@" + annotation)){
					fieldAnnotatedCorrected = true;
				}
			}
			scanner.close();
			
			if(numAnnotations != 1){
				return "INCORRECT: Multiple Annotations";
			}
			
			if(!fieldAnnotatedCorrected){
				return "INCORRECT: Wrong Annotation";
			}
			
			return "CORRECT";
		} catch (Exception e){
			return "ERROR: " + e.getMessage();
		}
	}
	
	public static void checkExpectations(String testBinary){
		File testBinaryFile = new File(testBinary);
		String testName = testBinaryFile.getName().replace(".jar", "");
		String expectedResult = getExpectedResult(testName);
		try {
			String result = getResult(testBinaryFile);
			boolean satisfied = false;
			if(expectedResult.equals("DEPENDS")){
				satisfied = true;
			}
			if(expectedResult.equals("READONLY") && result.equals("READONLY")){
				satisfied = true;
			}
			if(expectedResult.equals("MUTABLE") && result.equals("MUTABLE")){
				satisfied = true;
			}
			String annotationCorrectness = checkAnnotation(new File("../../testcases/source/AGT/" + testName + "/src/testcase/" + testName + ".java"), expectedResult);
			System.out.println(testName + "," + expectedResult + "," + result + "," + (satisfied ? "SATISFIED" : "UNSATISFIED") + "," + annotationCorrectness);
		} catch (Throwable t){
			System.out.println(testName + "," + expectedResult + ",ERROR: " + t.getMessage() + ",UNSATISFIED,INCORRECT");
		}
	}
	
	public static String getResult(File testBinary){
		Runtime rt = Runtime.getRuntime();
		try {
			Process p = rt.exec("java -jar " + testBinary.getAbsolutePath());
			BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
			StringBuilder result = new StringBuilder();
			String line = null; 
			while ((line = input.readLine()) != null){
	            result.append(line + "\n");
			}
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(result.toString());
			String line1 = scanner.nextLine();
			String line2 = scanner.nextLine();
			if(line1.equals(line2)){
				return "READONLY";
			} else {
				return "MUTABLE";
			}
		} catch (IOException e) {
			return "ERROR";
		}
	}
	
	public static String getExpectedResult(String test){
		String[] testComponents = test.split("_");
		String lhs = testComponents[2];
		if (lhs.equals("ObjectInstanceVariable")) {
			return "DEPENDS";
		} else if (lhs.equals("ObjectInstanceVariableArrayComponent")) {
			return "DEPENDS";
		} else if (lhs.equals("ThisInstanceVariable")) {
			return "MUTABLE";
		} else if (lhs.equals("ThisInstanceVariableArrayComponent")) {
			return "MUTABLE";
		} else if (lhs.equals("ClassVariable")) {
			return "READONLY";
		} else if (lhs.equals("ClassVariableArrayComponent")) {
			return "READONLY";
		} else if (lhs.equals("Parameter")) {
			return "READONLY";
		} else if (lhs.equals("ParameterArrayComponent")) {
			return "MUTABLE";
		} else if (lhs.equals("ParameterInstanceVariable")) {
			return "MUTABLE";
		} else if (lhs.equals("ParameterInstanceVariableArrayComponent")) {
			return "MUTABLE";
		}
		throw new IllegalArgumentException(test + " is invalid");
	}
	
}
