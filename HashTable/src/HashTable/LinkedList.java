package HashTable;
public class LinkedList {
	Node head;
	void addAtFirst(Student v){
		Node a = new Node();
		a.value = v;
		if(isEmpty())
			head = a;
		else{
			a.next = head;
			head = a;
		}
	}
	void addAtEnd(Student v){
		Node a = new Node();
		a.value = v;
		if(isEmpty())
			head = a;
		else{
			Node n = new Node();
			n = head;
			while(n.next != null)
				n = n.next;
			n.next = a;
		}
	}
	void remove(String v){
		Node d = new Node();
		d = head;
		if(isEmpty())
			return;
		else if(head.value.getRegNo().equals(v))
			head = head.next;
		else{
			while(d.next.value.getRegNo() != v){
				d = d.next;
			}
			d.next = d.next.next;
		}
	}
	boolean isEmpty(){
		if(head == null)
			return true;
		else
			return false;
	}
	Student search(String v){
		Node s = new Node();
		s = head;
		if(isEmpty())
			return null;
		else if(head.value.getRegNo().equals(v))
			return head.value;
		else{
			while(s.next.value.getRegNo() != v)
				s = s.next;
			return s.next.value;
		}
	}
	void displayAll(){
		Node t = new Node();
		t = head;
		if(isEmpty())
			return;
		else{
		while(t.next != null){
			System.out.println(t.value.getName() + " " + t.value.getRegNo() + " " +t.value.getContact());
			t = t.next;
		}}
		System.out.println(t.value.getName()+" "+t.value.getRegNo()+" "+t.value.getContact());
	}
}
