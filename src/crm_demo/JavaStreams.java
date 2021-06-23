package crm_demo;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class JavaStreams {
	@Test
	public void alphabet() {

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
			String actual = names.get(i);
			if (actual.startsWith("A")) {

				count++;
			}
			System.out.println(count);
		}
	}
}