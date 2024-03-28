
public class OrderedQueue {

	private Queue<NumCount> q;
	
	public OrderedQueue() {
		q = new Queue<NumCount>();
	}

	public void insertNum(int x) {
		
	}
	
	public int valueN(int n) {
		return -1;
	}
	
	public void removeNum(int num) {
		this.q.insert(null);
		while(this.q.head() != null ) {
			if(this.q.head().getNum == num) {
				if(this.q.head().getCount - 1 > 0) 
					this.q.head().setCount = this.lst.getCount() - 1;
				
				else 
					this.q.remove();
			}
			this.q.insert(this.q.remove());
		}
		
	}
	}
}
