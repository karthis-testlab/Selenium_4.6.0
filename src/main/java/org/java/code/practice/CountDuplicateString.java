package org.java.code.practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class CountDuplicateString {

	public static void main(String[] args) {	
		
		System.out.println("Number of duplicates: " + countDuplicateCharacterInString("args"));
		String str = "JAVAAAAAAA";
		String str2 = "";
		List<String> characters = Arrays.asList(str.split("")).stream().distinct().toList();
		System.out.println(characters.size());
		for (String character : characters) {
			str2+=character;
		}
		System.out.println(str2);
		LinkedHashSet<String> set = new LinkedHashSet<>();
		String[] strings = str.split("");
		for (String string : strings) {
			set.add(string);
		}
		System.out.println(str.length() - set.size());
	}
	
	public static int countDuplicateCharacterInString(String str) {
		LinkedHashSet<Character> set = new LinkedHashSet<>();  
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		return str.length() - set.size();
	}

}