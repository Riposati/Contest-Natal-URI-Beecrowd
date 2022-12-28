import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Map<Integer, Boolean> mapa = new HashMap<>();
		int a;
		Scanner s = new Scanner(System.in);

		a = s.nextInt();

		int odds = 1;

		for (int i = 0; i < a; i++) {

			mapa.put(odds, false);
			odds += 2;
		}

		while (a >= 0) {

			String aux = s.nextLine();

			if (mapa.containsKey(aux.length()))
				mapa.replace(aux.length(), true);

			a--;
		}

		// System.out.println(mapa);

		if (mapa.containsValue(false))
			System.out.println("no");
		else
			System.out.println("yes");

		s.close();
	}
}