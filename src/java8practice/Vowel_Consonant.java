package java8practice;

import java.util.Arrays;
import java.util.List;

public class Vowel_Consonant {

	public static void main(String[] args) {

		String s = "I love India";
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

		long vowelCount = s.chars().mapToObj(c -> (char) c).filter(Character::isLetter)
				.filter(c -> vowels.contains(Character.toLowerCase(c))).count();

		long consonantCount = s.chars().mapToObj(c -> (char) c).filter(Character::isLetter)
				.filter(c -> !vowels.contains(Character.toLowerCase(c))).count();

		System.out.println("Vowel count: " + vowelCount);
		System.out.println("Consonant count: " + consonantCount);

	}

}
