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
//		args = new String[]{"C:\\Users\\Ben\\Desktop\\test4","C:\\Users\\Ben\\Desktop\\test3\\summary.txt"};
		
		File inputDirectory = new File(args[0]);
		File summaryFile = new File(args[1]);
		File executionProofFile = new File(inputDirectory.getAbsolutePath() + File.separator + "execution-proof.txt");
		File analysisResultFile = new File(inputDirectory.getAbsolutePath() + File.separator + "reim-result.jaif");
		
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
		
		String analysisResult = "UNTYPED";
		try {
			Scanner scanner = new Scanner(analysisResultFile);
			while(scanner.hasNextLine()){
				String line = scanner.nextLine();
				if(line.trim().contains("field test:")){
					line = scanner.nextLine().trim();
					if(line.contains("@checkers.javari.quals.ReadOnly")){
						analysisResult = "READONLY";
					} else if(line.contains("@checkers.javari.quals.Mutable")){
						analysisResult = "MUTABLE";
					} else if(line.contains("@checkers.javari.quals.Polyread")){
						analysisResult = "POLYREAD";
					}
					throw new RuntimeException("Unexpected type " + line);
				}
			}
			scanner.close();
		} catch (Exception e){
			analysisResult = "Grader Error: " + e.getMessage();
		}
		
		String status;
		String rationale;
		if(analysisResult.equals("READONLY") && executionResult.equals("MUTABLE")){
			status = "FAIL";
			rationale = "test was mutated but reported as readonly";
			System.out.println("FAIL");
			summary.write(inputDirectory.getName() + ",FAIL\n");
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
		System.out.println(status);
		summary.write(inputDirectory.getName() + "," + status + "," + rationale + "\n");
		summary.close();
		
	}

}
