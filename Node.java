/**
 * 
 * 
 * @author Tobechi Onwenu
 * Generic Node class
 *
 * @param <E>
 */
public class Node<E> {
	E data;
	Node<E> link;

	
	public Node(E elementToHold, Node<E> objectBehind  ) {
		data = elementToHold;
		link = objectBehind;
	}

	/**
	 * @return the link
	 */
	public Node<E> getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(Node<E> link) {
		this.link = link;
	}

	/**
	 * @return the data
	 */
	public E getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(E data) {
		this.data = data;
	}

}
