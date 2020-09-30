package surprise.giving;

import java.util.concurrent.TimeUnit;

import surprise.containers.BagFactoryArrayList;
import surprise.containers.IBag;
import surprise.surprises.ISurprise;

public abstract class AbstractGiveSurprises {
	private IBag container;
	private int waitTime;
	private static final BagFactoryArrayList bagFactoryArrayList = 
	                                            new BagFactoryArrayList();
	
	public AbstractGiveSurprises(String type, int time) {
		this.container = bagFactoryArrayList.makeBag(type);
		this.waitTime = time;
	}
	
	public void put(ISurprise newSurprise) {
		container.put(newSurprise);
	}
	
	public void put(IBag surprises) {
		container.put(surprises);
	}
	
	public void give() {
		container.takeOut().enjoy();
		giveWithPassion();
	}
	
	public void giveAll() {
		while(!container.isEmpty()) {
			give();
			try {
				  TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
				} catch (InterruptedException e) {
				  // TODO Auto-generated catch block
				  e.printStackTrace();
				}
			}
	}
	
	public boolean isEmpty() {
		return container.isEmpty();
	}
	
	public int size() {
		return container.size();
	}
	
	abstract void giveWithPassion();
} 
