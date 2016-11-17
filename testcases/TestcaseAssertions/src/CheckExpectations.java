import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckExpectations {

	public static void main(String[] args){
		String testBinary = args[0];
		File testBinaryFile = new File(testBinary);
		String testName = testBinaryFile.getName().replace(".jar", "");
		String result = getResult(testBinaryFile);
		String expectedResult = getExpectedResult(testName);
		System.out.println(testName + "," + expectedResult + "," + result);
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
