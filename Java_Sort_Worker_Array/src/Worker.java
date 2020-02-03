
public class Worker implements Comparable {
	
	private int id;
	private String lastName;
	
	public Worker(int id, String lastName) {
		this.id = id;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Name of worker: Mr. " + lastName + " id: " + id;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Worker) {
			Worker other = (Worker) o;
			
			if(this.lastName.compareTo(other.lastName) != 0) {
				return this.lastName.compareTo(other.lastName);
			}
			
			if(this.id > other.id) {
				return 1;
			}
			
			if(this.id < other.id) {
				return -1;
			}
			
			return 0;
		}
		
		return 0;
	}

}
