package crm_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreams2 {
	@Test
	public void regular() {

		// public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Simbha");
		names.add("Anoop");
		names.add("Rubina");
		names.add("Nikki");
		names.add("Arohi");
		names.add("Anushree");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String uio = names.get(i);
			if (uio.startsWith("A")) {

				count++;
			}
			System.out.println(count);
		}
	}

	@Test
	public void streamFilter() {

		Stream.of("Abhijeet", "Alekhya", "Simbha", "Snoop", "Rubina", "Akshay").sorted().filter(s -> s.startsWith("A"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

	}

	@Test
	public void streamArray() {

		List<Integer> dist = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
		dist.stream().distinct().sorted().collect(Collectors.toList()).forEach(s -> System.out.println(s));

	}

	@Test

	public void streamConcat() {

		List<String> foo1 = Arrays.asList("Rahul Vaidya", "Nikki Tamboli", "Aly Goni", "Rubina"); // ARRARYS --> AsList
		List<String> foo2 = Arrays.asList("Atif Aslam", "Sunidhi Chauhan", "Sonu Nigam");

		Stream<String> newStream = Stream.concat(foo1.stream(), foo2.stream());

		// newStream.sorted().forEach(s -> System.out.println(s));

		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Nikki Tamboli"));

		Assert.assertTrue(flag);
		System.out.println(flag);
	}

}

	