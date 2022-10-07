package rahul_collections;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		//System.out.println(list);
		
		list.addLast("C");
		//System.out.println(list);
		list.addFirst("D");
		System.out.println(list);
		
		list.add(2, "E");
		System.out.println(list);
		
		list.remove("B");
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
	
	}

}
