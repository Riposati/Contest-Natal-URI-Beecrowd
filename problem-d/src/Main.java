import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);

		Set<String> conjunto = new HashSet<String>();

		int a, b;

		a = s.nextInt();

		while (a >= 0) {

			String aux = s.nextLine();
			// System.out.println(aux);
			if (!aux.split(" ")[0].equals(""))
				conjunto.add(aux.split(" ")[0]);
			a--;
		}

		b = s.nextInt();

		while (b >= 0) {

			String aux2 = s.nextLine();
			// System.out.println(aux2);
			if (!aux2.split(" ")[0].equals(""))
				conjunto.add(aux2.split(" ")[0]);
			b--;
		}

		List<String> sortedList = new ArrayList<>(conjunto);
		Collections.sort(sortedList);

		for (String str : sortedList)
			System.out.println(str);

		s.close();
	}

}
