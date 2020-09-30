package surprise.containers;

import java.util.ArrayList;

import surprise.surprises.ISurprise;

public abstract class Bag implements IBag{
	ArrayList<ISurprise> bag = new ArrayList<>();
	
	@Override
	public void put(ISurprise newSurprise) {
		bag.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while(!bagOfSurprises.isEmpty()) {
			put(bagOfSurprises.takeOut());
		}	
	}
	
	@Override
	public boolean isEmpty() {
		return this.size() == 0;
	}

	@Override
	public int size() {
		return bag.size();
	}
	
	public void print() {
		for(int i = 0; i < bag.size(); i++) {
			System.out.println(bag.get(i));
		}
		System.out.println();
	}
}
