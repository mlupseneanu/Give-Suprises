package surprise.surprises;

import java.util.Random;

public class Candies implements ISurprise{
	private static final int maxCandy = 50;
	private static final String[] types = {"chocolate", "jelly", "fruits", "vanilla"};
	private static final Random rand = new Random();
	private int number;
	private String type;
	
	public Candies(int number, String type) {
		this.number = number;
		this.type = type;
	}
	
	public static Candies generate() {
		int selectType = rand.nextInt(types.length);
		int selectNumber = rand.nextInt(maxCandy) + 1;
		Candies candy = new Candies(selectNumber, types[selectType]);
		return candy;
	}

	@Override
	public void enjoy() {
		System.out.println("Merry Christmas! You have recieved " + this.number + " " + this.type + " candies!\n");
		
	}
	
	@Override 
	public String toString() {
		return "Candie surprise: " + number + " " + type + " candies\n";
	}
	
}
