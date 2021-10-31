import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class TextWright {
	public static void main(String[] args) {
		String fileName = "file1.txt";
		String fileName2 = "file2.txt";
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		ArrayList<String> lines = new ArrayList<>();
		String longest = "";
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String s = null;
			while ((s = br.readLine()) != null) {
				if(s.length() > longest.length()) {
					longest = s;
				}
				lines.add(s);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		try {
			fw = new FileWriter(fileName2);
			bw = new BufferedWriter(fw);
			bw.write("Longest line in a file: " + longest + "\n");
			bw.write("Lines in a file: " + lines.size() + "\n");
			bw.write(lines.get(0) + " " + lines.get(1) + "\n");
			bw.close();
		} catch (Exception e) {
			e.printStackTrace(); 
		}
}
	}