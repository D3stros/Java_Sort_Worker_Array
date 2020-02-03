import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		Worker[] workers = new Worker[5];
		
		workers[0] = new Worker(10, "Daniel");
		workers[1] = new Worker(17, "Peter");
		workers[2] = new Worker(38, "Willis");
		workers[3] = new Worker(22, "Peter");
		workers[4] = new Worker(4, "Peter");
		
		for(Worker worker: workers) {
			System.out.println(worker);
		}
		
		Arrays.sort(workers);
		System.out.println();
		
		for(Worker worker: workers) {
			System.out.println(worker);
		}
		

	}

}
