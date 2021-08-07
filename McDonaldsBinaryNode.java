/**
 * 
 * @author Tobechi Onwenu
 * BinaryNode for McDonalds class
 *
 */
public class McDonaldsBinaryNode {

	McDonalds data;
	McDonaldsBinaryNode leftChild;
	McDonaldsBinaryNode rightChild;
	
	/**
	 * @param data
	 * @param leftChild
	 * @param rightChild
	 */
	public McDonaldsBinaryNode(McDonalds data, McDonaldsBinaryNode l, McDonaldsBinaryNode r) {
		this.data = data;
		this.leftChild = l;
		this.rightChild = r;
	}
	
	public boolean isLeaf() {
		return leftChild == null && rightChild == null;
	}

	/**
	 * @return the data
	 */
	public McDonalds getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(McDonalds data) {
		this.data = data;
	}

	/**
	 * @return the leftChild
	 */
	public McDonaldsBinaryNode getLeftChild() {
		return leftChild;
	}

	/**
	 * @param leftChild the leftChild to set
	 */
	public void setLeftChild(McDonaldsBinaryNode leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * @return the rightChild
	 */
	public McDonaldsBinaryNode getRightChild() {
		return rightChild;
	}

	/**
	 * @param rightChild the rightChild to set
	 */
	public void setRightChild(McDonaldsBinaryNode rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
