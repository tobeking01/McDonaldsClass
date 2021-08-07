import java.util.Iterator;

/**
 * 
 * @author Tobechi Onwenu
 *  Description: Region class based on McDonalds Application
 *
 */
public class Regions implements Iterable<McDonalds> {

	private String managerName;
	private McDonalds[] stores;
	private int numStores;
	private static int numRegions = 0;

	/**
	 * Constructor based on String and maxStore of the array for a manager
	 * 
	 * @param name
	 * @param maxStores
	 */
	public Regions(String name, int maxStores) {
		managerName = name;
		stores = new McDonalds[maxStores];
		numStores = 0;
		numRegions++;
	}

	public boolean removeStoreLink(McDonalds storeToRemove) {
		int index = findStore(storeToRemove);
		if(index == -1) {
			return false;
		}
		for (int i = index + 1; i < numStores; i++) {
			stores[i - 1] = stores[i];
		}
		numStores--;
		return true;
	}
	
	public int findStore(McDonalds target) {
		for(int i = 0; i < numStores; i++) {
			if(stores[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * method to addStores based on numStores count
	 * 
	 * @param storeToAdd
	 */
	public boolean addStore(McDonalds storeToAdd) {		
//		stores[numStores++] = storeToAdd;
		if (numStores < stores.length) {
			int i;
			for (i = numStores - 1; i >= 0 && stores[i].compareTo(storeToAdd) > 0; i--) {
				stores[i + 1] = stores[i];
			}
			stores[i + 1] = storeToAdd;
			numStores++;
			return true;
		} else {
			System.out.println("Full");
			return false;
		}
	}

	/**
	 * method to addStore to array based to earnings
	 * 
	 * @param earnings
	 */
	public boolean addStore(double earnings) {
		return addStore(new McDonalds(earnings));
	}

	/**
	 * method to find maxEarner
	 * 
	 * @return
	 */
	public McDonalds findMaxEarner() {
		McDonalds max = stores[0];
		for (int i = 0; i < numStores; i++) {
			if (max.getAnnualEarnings() < stores[i].getAnnualEarnings()) {
				max = stores[i];
			}
		}

		return max;
	}

	/**
	 * method to check if a McDonalds is in a region based on an array of items
	 * using linear search
	 * 
	 * @param target
	 * @return
	 */
	public boolean contains(McDonalds target) {
		for (int i = 0; i < numStores; i++) {
			if (stores[i].equals(target)) {
				return true;
			}
		}
		return false;
	}

	public int containsBinarySearch(int target) {
		int result = -1;
		int low = 0;
		int high = numStores - 1;
		while (result == -1 && low <= high) {
			int middle = low + ((high - low) / 2);
			if (target == stores[middle].getAnnualEarnings()) {
				result = middle;
			} else if (target > stores[middle].getAnnualEarnings()) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}
		return result;

	}

	/**
	 * toString for region class using McDonalds class
	 */
	public String toString() {
		String temp = "";
		temp += "Regional manager: " + managerName + "\n";
		temp += "Store Number  \t Store Manager \t Annual Earnings \n";
		temp += "******************************************************\n";
		for (int i = 0; i < numStores; i++) {
			temp += stores[i] + "\n";
		}
		return temp;
	}

	@Override
	public Iterator<McDonalds> iterator() {
		return new McDonaldsIterator();
	}

	private class McDonaldsIterator implements Iterator<McDonalds> {

		int cursor = 0;

		@Override
		public boolean hasNext() {
			return cursor < numStores;
		}

		@Override
		public McDonalds next() {
			return stores[cursor++];
		}

	}

}
