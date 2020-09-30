package surprise.containers;

import surprise.surprises.ISurprise;

public class LIFOBag extends Bag {
	@Override
	public ISurprise takeOut() {
		return bag.remove(bag.size()-1);
	}

	
}
