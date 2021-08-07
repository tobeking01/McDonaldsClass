/**
 * 
 * @author Tobechi Onwenu
 * heap for McDonalds class
 *
 */
public class McDonaldsHeap {
	McDonalds[] heap;
	int numItems;
	
	public McDonaldsHeap(int maxItems) {
		heap = new McDonalds[maxItems];
		numItems =  0;
	}
	
	public McDonalds poll() {
		McDonalds output = heap[0];
		heap[0] = heap[numItems - 1];
		numItems--;
		heapifyDown(0);
		return output;
	}
	
	private void heapifyDown(int parent) {
		int largest = parent;
		int left = leftOfParent(parent);
		int right = rightOfParent(parent);
		
		if(left < numItems && heap[left].compareTo(heap[largest]) > 0) {
			largest = left;
		}
		
		if(right < numItems && heap[right].compareTo(heap[largest]) > 0) {
			largest = right;
		}
		
		if(largest != parent) {
			swap(largest, parent);
			heapifyDown(largest);
		}
		
		
	}

	public void insert(McDonalds elementToAdd) {
		heap[numItems++] = elementToAdd;
		heapifyUp(numItems - 1);
	}
	
	private void swap(int index1, int index2) {
		McDonalds temp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = temp;
	}

	private void heapifyUp(int index) {
		int parentIndex = parent(index);
		if (index > 0 && heap[index].compareTo(heap[parentIndex]) > 0) {
			swap(index, parentIndex);
			heapifyUp(parentIndex);
		}
		
	}
	
	private int leftOfParent(int parentIndex) {
		return 2 * parentIndex + 1;
	}
	
	private int rightOfParent(int parentIndex) {
		return 2 * parentIndex + 2;
	}
	
	private int parent(int childIndex) {
		return (childIndex - 1) / 2;
	}
	
}
