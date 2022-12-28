import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);

		BigInteger a = new BigInteger(s.next());
		BigInteger b = new BigInteger(s.next());

		if (a.compareTo(b) == 1 || a.compareTo(b) == 0)
			System.out.println("Sobraram " + a.mod(b) + " presentes!");
		else
			System.out.println("Ainda faltam " + b.subtract(a) + " presentes!");

		s.close();
	}
}