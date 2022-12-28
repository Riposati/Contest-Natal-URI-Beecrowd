package uri;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class MyType {

	public String name;
	public String region;
	public int dist;

	public MyType(String name, String region, int dist) {
		this.name = name;
		this.region = region;
		this.dist = dist;
	}

	public String getName() {
		return this.name;
	}

	public String getRegion() {
		return this.region;
	}

	public int getDist() {
		return this.dist;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class Main {

	public static void main(String[] args) throws IOException {

		List<MyType> myTypes = new ArrayList<MyType>();
		List<String> auxArr = new ArrayList<String>();
		int children;

		Scanner s = new Scanner(System.in);

		children = s.nextInt();

		while (children >= 0) {
			auxArr.add(s.nextLine());
			children--;
		}

		for (int i = 1; i < auxArr.size(); i++) {
			myTypes.add(new MyType(auxArr.get(i).split(" ")[0], auxArr.get(i).split(" ")[1],
					Integer.parseInt(auxArr.get(i).split(" ")[2])));
		}

		Comparator<MyType> compareByName = Comparator.comparing(MyType::getRegion).thenComparing(MyType::getDist)
				.thenComparing(MyType::getName);

		List<MyType> sortedChildren = myTypes.stream().sorted(compareByName).collect(Collectors.toList());

		for (MyType people : sortedChildren) {
			System.out.println(people.getName());
		}
		s.close();
	}
}
