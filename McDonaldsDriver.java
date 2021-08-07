import java.util.Scanner;
/**
 * 
 * @author Tobechi Onwenu
 * McDonaldsDriver
 *
 */

public class McDonaldsDriver {

	public static void main(String[] args) {

		McDonalds store1 = new McDonalds(true, 2000, "Tobe1");
		McDonalds store2 = new McDonalds(false, 4800, "Tobe2");
		McDonalds store3 = new McDonalds("Tobe3", 3200);
		McDonalds store4 = new McDonalds(false, 1000, "Jessy");

		System.out.println(store1.equals(store2));
		System.out.println(store1.equals(store1));

		Regions world = new Regions("Tobechi Onwenu", 10);

		RegionLinked world2 = new RegionLinked("Tobechi");

		world.addStore(store4);
		world.addStore(store2);
		world.addStore(store1);
		world.addStore(store3);

		world2.addStoreLink(store4);
		world2.addStoreLink(store2);
		world2.addStoreLink(store1);
		world2.addStoreLink(store3);
		System.out.println(world + "\n");
		world.removeStoreLink(store2);

		world.removeStoreLink(store2);

		System.out.println("Sorted Array");
		System.out.println(world + "\n");

		System.out.println("Sorted Linked List");
		System.out.println(world2 + "\n");

		for (McDonalds micky : world) {
			System.out.println(store1.equals(micky));
			System.out.println(micky);
			System.out.println(store1);
		}

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the annual sales: ");
		double earnings = input.nextDouble();
		store1.setAnnualEarnings(earnings);

		System.out
				.println("The annual sale for store" + store1.getStoreNumber() + " is $" + store1.getAnnualEarnings());

		System.out.println(store1);
		System.out.println(store4);

		System.out.println(world.containsBinarySearch(4800));

		RegionTree worldTree = new RegionTree();

		worldTree.add(store1);
		worldTree.add(store2);
		worldTree.add(store4);
		worldTree.add(store3);

		System.out.println(worldTree);
		input.close();

	}

}
