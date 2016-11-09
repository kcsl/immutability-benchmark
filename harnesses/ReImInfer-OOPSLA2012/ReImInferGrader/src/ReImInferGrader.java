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
		
		File inputDirectory = new File(args[0]);
		File summaryFile = new File(args[1]);
		File executionProof = new File(inputDirectory.getAbsolutePath() + File.separator + "execution-proof.txt");
		File analysisResult = new File(inputDirectory.getAbsolutePath() + File.separator + "reim-result.jaif");
		
		FileWriter summary = new FileWriter(summaryFile, true);
		
		Scanner scanner = new Scanner(executionProof);
		HashMap<String,Set<String>> comparisons = new HashMap<String,Set<String>>();
		while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			// strip testcase name
			line = line.replace(line.split(" ")[0], "").replace(" ",""); 
			// parse object fields
			line = line.substring(line.indexOf("[") + 1, line.lastIndexOf("]"));
			Scanner tokens = new Scanner(line).useDelimiter(",|=");
			while(tokens.hasNext()){
				String field = tokens.next();
				// consider nested objects 
				if(line.contains("=[")){
					line = line.substring(line.indexOf("[") + 1);
					tokens = new Scanner(line).useDelimiter("]");
				}
				String value = tokens.next();
				if(!comparisons.containsKey(field)){
					comparisons.put(field, new HashSet<String>());
				}
				comparisons.get(field).add(value);
			}
		}
		
		HashMap<String,Boolean> mutations = new HashMap<String,Boolean>();
		for(Entry<String,Set<String>> entry : comparisons.entrySet()){
			mutations.put(entry.getKey(), entry.getValue().size() != 1);
		}
		
		HashMap<String,String> analysis = new HashMap<String,String>();
		scanner = new Scanner(analysisResult);
		while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			for(String field : mutations.keySet()){
				if(line.contains("field " + field + ":")){
					line = scanner.nextLine();
					if(line.contains("@checkers.javari.quals.ReadOnly")){
						analysis.put(field, "READONLY");
					} else if(line.contains("@checkers.javari.quals.Mutable")){
						analysis.put(field, "MUTABLE");
					} else if(line.contains("@checkers.javari.quals.Polyread")){
						analysis.put(field, "POLYREAD");
					} else {
						throw new RuntimeException("Unexpected input: " + line);
					}
					break;
				}
			}
		}
		
		FileWriter writer = new FileWriter(new File(inputDirectory.getAbsolutePath() + File.separator + "grader-logic.txt"));
		writer.write("Comparisons: " + comparisons.toString() + "\n");
		writer.write("Mutations: " + mutations.toString() + "\n");
		writer.write("Analysis: " + analysis.toString() + "\n");
		writer.close();
		
		for(Entry<String,String> result : analysis.entrySet()){
			String key = result.getKey();
			if(result.getValue().equals("READONLY") && mutations.containsKey(key) && mutations.get(key) == true){
				// analysis reported readonly but there was a mutation
				System.out.println("FAIL");
				summary.write(inputDirectory.getName() + ",FAIL\n");
				summary.close();
				return;
			} else if(result.getValue().equals("MUTABLE") && mutations.containsKey(key) && mutations.get(key) == false){
				// analysis reported mutable, but there was no mutation
				System.out.println("FAIL");
				summary.write(inputDirectory.getName() + ",FAIL\n");
				summary.close();
				return;
			} 
//			else if(result.getValue().equals("POLYREAD") && mutations.containsKey(key) && mutations.get(key) == false){
//				// analysis reported polyread but there was no mutation
//				System.out.println("FAIL");
//				return;
//			}
		}
		System.out.println("PASS");
		summary.write(inputDirectory.getName() + ",PASS\n");
		summary.close();
		
	}

}
