package surprise.containers;

import surprise.surprises.ISurprise;

public class FIFOBag extends Bag {

	@Override
	public ISurprise takeOut() {
		return bag.remove(0);
	}
	
}
