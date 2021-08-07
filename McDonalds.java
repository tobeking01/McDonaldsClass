/**
 * 
 * @author Tobechi Onwenu
 * Description: McDonalds Application
 */
public class McDonalds implements Comparable<McDonalds>{

	private boolean hasGoldenArches;
	private int storeNumber;
	private double annualEarnings;
	private String storeManagerName;
	private static int numStores = 0;

	/**
	 * constructor based on earnings
	 * 
	 * @param earnings
	 */
	public McDonalds(double earnings) {
		hasGoldenArches = true;
		storeNumber = ++numStores;
		annualEarnings = earnings;
		storeManagerName = new String("Not Tobe");
	}

	/**
	 * constructor based on store manager name and earnings
	 * 
	 * @param name
	 * @param earnings
	 */
	public McDonalds(String name, double earnings) {
		hasGoldenArches = true;
		storeManagerName = name;
		annualEarnings = earnings;
		storeNumber = ++numStores;

	}

	/**
	 * Constructor based on has golden arches, earnings and store manager name
	 * 
	 * @param golden
	 * @param earnings
	 * @param name
	 */
	public McDonalds(boolean golden, double earnings, String name) {
		hasGoldenArches = golden;
		storeNumber = ++numStores;
		annualEarnings = earnings;
		storeManagerName = name;
	}


	/**
	 * method to addEarnings and return earnings
	 * 
	 * @param amountToAdd
	 * @return
	 */
	public double addEarnings(double amountToAdd) {
		annualEarnings += amountToAdd;
		return annualEarnings;
	}

	/**
	 * A method to return a GoldStore
	 * method to check is store is the best store based on annual earnings over 1,000,000
	 * return true or false
	 * 
	 * @return
	 */
	public boolean isGoldStore() {
		if (annualEarnings > 100000) {
			return true;
		}
		return false;
	}
	/**
	 * equals method to check if two McDonalds are desame based on storeNumber
	 * 
	 * @param other
	 * @return
	 */
	public boolean equals(Object other) {
		if (other instanceof McDonalds) {
		return this.storeNumber == ((McDonalds) other).storeNumber;
	}else {
		return false;
		}
	}


	/**
	 * A compareTo method based on storeNumber
	 */
	@Override
	public int compareTo(McDonalds other) {
		return this.storeNumber - other.storeNumber;
	}

	
	/**
	 * toString method for McDonalds referencing Regions
	 * 
	 * @param golden
	 */
	public String toString() {
		String temp = storeNumber + "\t\t" + storeManagerName + "\t\t" + annualEarnings;
		return temp;
	}

	/**
	 * get method for boolean hasGoldenArches
	 * 
	 * @return
	 */
	public boolean getHasGoldenArches() {
		return hasGoldenArches;
	}

	/**
	 * get method for storeNumber
	 * 
	 * @return
	 */
	public int getStoreNumber() {
		return storeNumber;
	}

	/**
	 * get method for annualEarnings
	 * 
	 * @return
	 */
	public double getAnnualEarnings() {
		return annualEarnings;
	}

	public String getManagerName() {
		return storeManagerName;
	}

	/**
	 * set method for hasGoldenArches
	 * 
	 * @param golden
	 */
	public void setHasGoldenarches(boolean golden) {
		hasGoldenArches = golden;
	}

	/**
	 * set method for storeNumber
	 * 
	 * @param golden
	 */
	public void setStoreNumber(int number) {
		storeNumber = number;
	}

	/**
	 * set method for annualEarnings
	 * 
	 * @param golden
	 */
	public void setAnnualEarnings(double earnings) {
		annualEarnings = earnings;
	}

	/**
	 * set method for storeManagerName
	 * 
	 * @param golden
	 */
	public void setManagerName(String name) {
		storeManagerName = name;
	}

}
