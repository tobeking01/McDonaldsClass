/**
 * 
 * @author Tobechi Onwenu
 * Linked class for Region
 *
 */
public class RegionLinked {
	private String managerName;
	Node<McDonalds> head;
	int manyNodes;
	private static int numRegions = 0;

	
	public RegionLinked(String name) {
		managerName = name;
		head = null;
		manyNodes = 0;
		numRegions++;
	}
	
	public void add(McDonalds storeToAdd) {
		head = new Node<McDonalds>(storeToAdd, head);
		manyNodes++;
	}
	
	public void addStoreLink(McDonalds storeToAdd) {
		if (head == null) {
			head = new Node<McDonalds>(storeToAdd, null);
		}else if (storeToAdd.compareTo(head.getData()) < 0) {
			head = new Node<McDonalds>(storeToAdd, head);
		}else {
			Node<McDonalds> previous = findPreviousNodeAdd(storeToAdd);
			previous.setLink(new Node<McDonalds>(storeToAdd, previous.getLink()));
		}
		manyNodes++;
	}
	
	public void removeStore(McDonalds storeToRemove) {
		if (head != null && head.getData().equals(storeToRemove)) {
			head = head.getLink();
		}else if (head != null) {
			Node<McDonalds> previous = findPreviousNodeRemove(storeToRemove);
			previous.setLink(previous.getLink().getLink());
		}
	}
	
	private Node<McDonalds> findPreviousNodeRemove(McDonalds storeToFind) {
		Node<McDonalds> cursor = head;
		while(cursor.getLink() != null && !cursor.getLink().getData().equals(storeToFind)) {
			cursor = cursor.getLink();
		}
		return cursor;
	}
	
	private Node<McDonalds> findPreviousNodeAdd(McDonalds storeToFind) {
		Node<McDonalds> cursor = head;
		while(cursor.getLink() != null && cursor.getLink().getData().compareTo(storeToFind) > 0) {
			cursor = cursor.getLink();
		}
		return cursor;
	}

	/**
	 * toString for region class using McDonalds class
	 */
	public String toString() {
		String temp = "";
		temp += "Regional manager: " + managerName + "\n";
		temp += "Store Number  \t Store Manager \t Annual Earnings \n";
		temp += "******************************************************\n";
		
		Node<McDonalds> cursor = head;
		while(cursor != null) {
			temp += cursor.getData() + "\n";
			cursor = cursor.getLink();
		}
		return temp;
	}
}
