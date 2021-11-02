package lesson12.hw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

public class HW4 {
	
	public static void main(String[] args) {
		
		String str = null;
		ArrayList<String> strings = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("1.txt"));
			while ((str = br.readLine()) != null) {
				strings.add(str);
			}
			br.close();
		} catch (FileNotFoundException e){
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		Optional<String> longestLine = strings.stream().max((string1, string2) -> string1.length() - string2.length());		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("2.txt"));
			bw.write(strings.size() + "\n");
			bw.write(longestLine.get());
			bw.write("Andriy, 30-10-93");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
