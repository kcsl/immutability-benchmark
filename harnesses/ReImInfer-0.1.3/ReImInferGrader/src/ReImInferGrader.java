import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ReImInferGrader {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		// debug
//		args = new String[]{"/Users/benjholla/Desktop/test","/Users/benjholla/Desktop/test/summary.txt"};
		
		File inputDirectory = new File(args[0]);
		File summaryFile = new File(args[1]);
		File executionProofFile = new File(inputDirectory.getAbsolutePath() + File.separator + "execution-proof.txt");
		File analysisResultFile = new File(inputDirectory.getAbsolutePath() + File.separator + "reim-result.csv");
		
		FileWriter summary = new FileWriter(summaryFile, true);
		
		String executionResult;
		try {
			Scanner scanner = new Scanner(executionProofFile);
			String line1 = scanner.nextLine();
			String line2 = scanner.nextLine();
			if(line1.equals(line2)){
				executionResult = "READONLY";
			} else {
				executionResult = "MUTABLE";
			}
			scanner.close();
		} catch (Exception e){
			executionResult = "Grader Error: " + e.getMessage();
		}
		System.out.println("Execution Result: " + executionResult);
		
		String analysisResult = "UNTYPED";
		try {
			Scanner scanner = new Scanner(analysisResultFile);
			while(scanner.hasNextLine()){
				String line = scanner.nextLine().trim();	
				if(line.contains("\t" + "test" + "\t")){
					if(line.contains("@Readonly")){
						analysisResult = "READONLY";
					} else if(line.contains("@Mutable")){
						analysisResult = "MUTABLE";
					} else if(line.contains("@Polyread")){
						analysisResult = "POLYREAD";
					} else {
						throw new RuntimeException("Unexpected type " + line);
					}
					break;
				}
			}
			scanner.close();
		} catch (Exception e){
			analysisResult = "Grader Error: " + e.getMessage();
		}
		System.out.println("Analysis Result: " + analysisResult);
		
		String status;
		String rationale;
		if(analysisResult.equals("READONLY") && executionResult.equals("MUTABLE")){
			status = "FAIL";
			rationale = "test was mutated but reported as readonly";
		} else if(analysisResult.equals("MUTABLE") && executionResult.equals("READONLY")){
			status = "FAIL";
			rationale = "test was readonly but reported as mutable";
		} else {
			if(analysisResult.equals("POLYREAD") && executionResult.equals("MUTABLE")){
				status = "PASS";
				rationale = "polyread indicates a mutation could occur in a given context";
			} else if(analysisResult.equals(executionResult)){
				status = "PASS";
				rationale = "correct analysis";
			} else {
				status = "FAIL";
				rationale = "UNKNOWN";
			}
		}
		System.out.println("Score: " + status + "," + rationale);
		summary.write(inputDirectory.getName() + "," + status + "," + rationale + "\n");
		summary.close();
		
	}

}
