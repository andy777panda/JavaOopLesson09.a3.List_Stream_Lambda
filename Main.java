package net.ukr.andy777;

/*
 Lesson09add
 3. На основе строки сгенерируйте массив целых чисел, где каждое число должно быть ASCII кодом соответствующей буквы.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		String str = "maMA MYla RamU - МАма миЛА рАМу";
		System.out.println(str);

		List<Integer> res = str.chars()
				.mapToObj(n -> (int) Character.valueOf((char) n))
				.collect(Collectors.toList());

		System.out.println(res);
	}
}
