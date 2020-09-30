package surprise.containers;

import java.util.Random;

import surprise.surprises.ISurprise;

public class RandomBag extends Bag{

  private static final Random rand = new Random();
  
	@Override
	public ISurprise takeOut() {
		return bag.remove(rand.nextInt(bag.size()));
	}
}
