package lesson13.hw;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main13 {
	
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("String", "str", "String1", "str1", "String2", "str2");
		List<String> list2 = new ArrayList<>();
		list2.addAll(list1);
        list2.removeIf(string -> string.length() >= 5);
        System.out.println(list2);
        
        //2.
        System.out.println(encrypt("abc", 3));
        System.out.println(decrypt("xyz", 10));
        
        //3.
        System.out.println(validateDate("01.12.21"));  
       
	}
	
	public static boolean validateDate(String date) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM.dd.yy");
		try {
			LocalDate.parse(date, format);
		} catch (DateTimeParseException e) {
			return false;
		}
    	return true;
    }
	
	public static String encrypt(String str, int n) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			chars[i] += n;
		}
		return String.valueOf(chars);
	}
	
	public static String decrypt(String str, int n) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			chars[i] -= n;
		}
		return String.valueOf(chars);
	}

}
