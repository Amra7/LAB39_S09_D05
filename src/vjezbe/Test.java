package vjezbe;

public class Test {

	public static void main(String[] args) {
		
//		LinkedListInt lli = new LinkedListInt();
//		lli.add(1);
//		lli.add(2);
//		lli.add(5);
//		lli.add(6);
//		lli.add(9);
//		lli.add(12,5);
//		System.out.println(lli.toString());
//		
//
////		lli.remove(7);
//		System.out.println(lli.toString());
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		int c =45;
		ll.add(c);
		System.out.println(ll.toString());
		
		
		
		
//		ArrayListInt ali = new ArrayListInt();
//		ali.add(4);
//		ali.add(7);
//		ali.add(8);
//		ali.add(9);
//		ali.add(19);
//		ali.add(24);
//		ali.add(56,3);
//		
//		System.out.println(ali.toString());
////		ali.remove(8);
////		System.out.println(ali.toString());
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(7);
		al.add(9);		
		System.out.println(al.toString());
		al.remove(1);
		System.out.println(al.toString());
 
	}
	
	
	
}
