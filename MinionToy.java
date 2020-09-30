package surprise.surprises;

public class MinionToy implements ISurprise {
	private static final String[] names = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
	private static int counter = 0;
	private String name;
	
	public MinionToy(String name) {
		this.name = name; 
	}
	
	public static MinionToy generate() {
		MinionToy toy = new MinionToy(names[counter]);
		counter = (counter+1) % names.length;
		return toy;
	}

	@Override
	public void enjoy() {
		System.out.println("Merry Christmas! You have e new buddy, the minion " + this.name + "\n");		
	}
	
	@Override
	public String toString() {
		return "Minion toy surprise: " + "the minion, " + name + "\n";
	}
}
