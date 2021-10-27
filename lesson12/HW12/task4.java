package lesson12.HW12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class task4 {

	public static void main(String[] args) {
		String file1 = "file1.txt";
		BufferedReader br = null;
		FileReader fr = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		String file2 = "file2.txt";
		String name = "\nMy name Andriy, my birthday date 23.04.1993";
		try {
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			String line = null;
			int count = 0;// number of lines in file1.txt
			List<String> text = new ArrayList<String>();
			while ((line = br.readLine()) != null) {
				text.add(line);
				count++;
			}
			int maxI = 0;
			int max = 0;
			for (int i = 0; i < text.size(); i++) {
				if (text.get(i).length() > max) {
					max = text.get(i).length();
					maxI = i;
				}
			}
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			bw.write("file1.txt has " + String.valueOf(count) + " lines");
			bw.write("\nThe longets line has index " + maxI + ": " + text.get(maxI));
			bw.write(name);
			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
