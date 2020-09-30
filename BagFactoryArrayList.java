package surprise.containers;

public class BagFactoryArrayList implements IBagFactory {

	@Override
	public IBag makeBag(String type) {
		switch(type) {
			case "RANDOM":
				return new RandomBag();
			case "FIFO":
				return new FIFOBag();
			case "LIFO":
				return new LIFOBag();
			default:
			  System.out.println("Error: Unknown bag type.");
				return null;
		}
	}

}
