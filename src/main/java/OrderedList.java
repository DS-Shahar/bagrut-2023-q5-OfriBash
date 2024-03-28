
public class OrderedList {

	private Node<NumCount> lst;

	public void insertNum(int x) {
		System.out.println("insert " + x);
	}

	public int valueN(int n) {		
		return -1;
	}

	public void removeNum(int x) {
		Node <NumCount> first = this.lst;
		
		while(this.lst.getNext() != null ) {
			if(this.lst.getNext().getValue().getNum == num) {
				if(this.lst.getCount -1 > 0) {
					this.lst.getValue().setCount = this.lst.getCount() - 1;
					return first;
				}
				else {
					this.lst.setNext(lst.getNext().getNext());
					return first;
				}
			}
			this.lst = this.lst.getNext();
		}
	}
	}
}
