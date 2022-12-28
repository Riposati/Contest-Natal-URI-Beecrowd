import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		String str;
		StringBuilder strB = new StringBuilder("");

		str = in.readLine();

		String[] aux = str.split(" ");

		for (int i = 0; i < aux.length; i++) {

			if (aux[i].equals("blue"))
				aux[i] = "azul";

			if (aux[i].equals("red"))
				aux[i] = "vermelho";
			
			strB.append(aux[i]);
			
			if(i < aux.length-1)
				strB.append(" ");
				
		}
		System.out.println(strB);
	}
}
