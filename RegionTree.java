/**
 * 
 * @author Tobechi Onwenu
 * BinaryTree Class for region
 *
 */
public class RegionTree {
	
	McDonaldsBinaryNode root;
	
	public RegionTree() {
		root = null;
	}
	
	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(McDonaldsBinaryNode current) {
		if (current != null) {
			inOrder(current.getLeftChild());
			System.out.println(current.getData());
			inOrder(current.getRightChild());
		}
	}
	
	public void add(McDonalds element) {
		if (root == null) {
			root = new McDonaldsBinaryNode(element, null, null);
		}else {
			add(root, element);
		}
	}

	private void add(McDonaldsBinaryNode current, McDonalds element) {
		if (element.compareTo(current.getData()) <= 0) {
			if (current.getLeftChild() == null) {
				current.setLeftChild(new McDonaldsBinaryNode(element, null, null));
			}else {
				add(current.getLeftChild(), element);
			}
		}else {
			if (current.getRightChild() == null) {
				current.setRightChild(new McDonaldsBinaryNode(element, null, null));
			}else {
				add(current.getRightChild(), element);
			}
		}
	}
	
	public String toString() {
		String temp = "";
		temp += "Store Number  \t Store Manager \t Annual Earnings \n";
		temp += "******************************************************\n";
		temp += toString(root);
		return temp;
		
	}

	private String toString(McDonaldsBinaryNode root) {
		String result = "";
		if (root != null) {
			result += toString(root.getLeftChild());
			result += toString(root.getRightChild());
			result += root.getData().toString() + "\n";
		}
		return result;
	}
	

}
