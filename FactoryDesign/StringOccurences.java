package FactoryDesign;

import java.util.HashMap;
import java.util.Map;

public class StringOccurences {
	public static void main(String[] args) {

		String s = "Hello Worldd";
		s = s.replace(" ", "");

		char[] ch = s.toCharArray();
		boolean[] visited = new boolean[ch.length];

		for (int i = 0; i < ch.length; i++) {

			if (visited[i])
				continue;

			int count = 1;

			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					visited[j] = true;
				}
			}

			System.out.println(ch[i] + " : " + count);
		}

		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			if (c != ' ') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}
		map.forEach((k, v) -> System.out.println(k + " = " + v));
	}
}
