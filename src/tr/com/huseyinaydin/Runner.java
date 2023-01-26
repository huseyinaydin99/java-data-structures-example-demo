package tr.com.huseyinaydin;
/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

public class Runner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insertAtStart(25);
		
		list.insertAt(0, 55);
		
		list.deleteAt(2);
		
		list.show();
	}

}
