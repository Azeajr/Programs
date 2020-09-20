public class LList{
	private LLNode head;

	public LList(){
		head=null;
	}

	public int LLsize(){
		int count = 0;
		LLNode current = head;
		if(head==null){
			return 0;
		}else{
			while(current.next != null){
				count++;
				current=current.next;
			}
			count++;

			return count;
		}

	}

	public void selectionSort(){
		LLNode index=head;
		LLNode min;
		LLNode current;
		LLNode temp;

		while(index.next != null){
			min=index;

			current=index.next;

			while(current.next != null){
				if(current.value < min.value){
					min=current;
				}
				current=current.next;
			}

			temp=min;
			min=index;
			index=temp;


			index=index.next;
		}
}

	public void add(int value){
		LLNode node = new LLNode(value);
		LLNode current;

		if(head==null){
			head=node;
		}else{
			current=head;
			while(current.next != null){
				current=current.next;
			}
			current.next=node;
		}
	}

	public String toString(){
		String result = "";

		LLNode current = head;
		while(current != null){
			result += current.value + "\n";
			current=current.next;
		}
		return result;
	}

	private class LLNode{
		public int value;
		public LLNode next;

		public LLNode(int value){
			this.value=value;
			next=null;
		}
	}


}
