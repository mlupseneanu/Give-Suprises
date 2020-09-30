package surprise.giving;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {
	
  public GiveSurpriseAndSing(String type, int time) {
		super(type, time);
	}

	@Override
	void giveWithPassion() {
		System.out.println("Singing a nice song, full of joy and genuine excitement…\n\n");	
	}
}
