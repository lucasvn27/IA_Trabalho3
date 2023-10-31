import java.util.*;

public class Client {
	
	public static void main (String [] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BestFirst s = new BestFirst();
		
		int valorInicial = sc.nextInt();
		int goalTemp = valorInicial * 3;
		
		Iterator<BestFirst.State> it = s.solve(new Board(valorInicial, "nada"), new Board(goalTemp,"nada"));
		while (it.hasNext()) {
			BestFirst.State i = it.next();
			System.out.println(i);
			if (!it.hasNext()) {
				System.out.println();
				System.out.println((int) i.getG());
			}
		}
		
		sc.close();
	}

}

