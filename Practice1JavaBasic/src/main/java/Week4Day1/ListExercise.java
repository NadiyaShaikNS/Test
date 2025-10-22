package Week4Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ListExercise {
	public static void main(String[] args) {
		List<String> Listofnames = new ArrayList<String>();
		List<String> SecondList = new ArrayList<String>();
		List<String> ThirdList = new ArrayList<>(Arrays.asList("a","b", "c"));
		Listofnames.add("a");
		Listofnames.add("b");
		Listofnames.add("c");
		System.out.println(Listofnames);
		Listofnames.add(0, "added in middle");
		System.out.println(Listofnames);
		int size = Listofnames.size();
		System.out.println(size);
		String retrieve = Listofnames.get(2);
		System.out.println(retrieve);
		Listofnames.remove(1);
		System.out.println(Listofnames);
		boolean remove = Listofnames.remove("c");
		System.out.println(remove);
		//Listofnames.clear();
		//System.out.println(Listofnames);
	}

}
