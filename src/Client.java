import java.util.*;

public class Client {
	
	public static void main (String [] args) throws Exception { //nao muda
		Scanner sc = new Scanner(System.in);
		AStar s = new AStar();
		
		int valorInicial = sc.nextInt();
		int goalTemp = valorInicial * 3;

		long startTime = System.currentTimeMillis(); // Record start time
		
		Iterator<AStar.State> it = s.solve(new Board(valorInicial, "nada"), new Board(goalTemp,"nada"));

		long endTime = System.currentTimeMillis(); // Record end time
        long executionTime = endTime - startTime;

		int nosGerados = s.getGeneratedNodesCount();
		int nosExpandidos = s.getExpandedNodesCount();
		while (it.hasNext()) {
			AStar.State i = it.next();
			System.out.println(i);
			if (!it.hasNext()) {
				System.out.println();
				System.out.println((int) i.getG());
				System.out.println("Tempo de execucao: " + executionTime + " milissegundos");
                System.out.println("Memoria: " + getMemoryUsage() + " bytes");
				System.out.println("Nos gerados: " + nosGerados);
				System.out.println("Nos expandidos: " + nosExpandidos);
			}
		}
		
		sc.close();
	}

	private static long getMemoryUsage() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }
}