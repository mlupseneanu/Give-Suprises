package surprise.surprises;

import java.util.Random;

public class FortuneCookie implements ISurprise {
	private static final String[] messages = {
			"Today it's up to you to create the peacefulness you long for. (Ghandi",
			"A friend asks only for your time not your money., (B. Gates)",
			"If you refuse to accept anything but the best, you very often get it. (E. Vedder)",
			"A smile is your passport into the hearts of others. (J. Johnson)",
			"Your high-minded principles spell success. (T. Stark)",
			"Hard work pays off in the future, laziness pays off now. (S. Cooper)",
			"Change can hurt, but it leads a path to something better. (B. Obama)",
			"You learn from your mistakes... You will learn a lot today. (V. Hugo)",
			"Be on the lookout for coming events; They cast their shadows beforehand. (A. Hopkins)",
			"There is no greater pleasure than seeing your loved ones prosper. (C. America)",
			"It is now, and in this world, that we must live. (C. Diem)",
			"The greatest risk is not taking one. (P. Parker)",
			"Just do it! (Nike)",
			"If debugging is the process of removing software bugs, then programming must be the process of putting them in.”" + 
			"- Edsger Dijkstra",
			"Measuring programming progress by lines of code is like measuring aircraft building progress by weight. (Bill Gates)",
			"“Nine people can’t make a baby in a month.” (regarding the addition of more programmers to get a project completed faster)" + 
			"- Fred Brooks",
			"“Don’t worry if it doesn’t work right. If everything did, you’d be out of a job.” (Mosher’s Law of Software Engineering)",
			"“Good programming is 99% sweat and 1% coffee.” (Anonymous)",
			"“Without requirements or design, programming is the art of adding bugs to an empty text file.” (Louis Srygley)",
			"“Programming is similar to a game of golf. The point is not getting the ball in the hole but how many strokes it takes.” (Harlan Mills)",
			"“Debugging is twice as hard as writing the code in the first place. Therefore, if you write the code as cleverly as possible, you are–by definition–not smart enough to debug it.” (Brian Kernighan)",
			"“The most disastrous thing that you can ever learn is your first programming language.” (Keith Bostic)"
			};
	private static final Random rand = new Random();
	private String message;

	private FortuneCookie(String message) {	
		this.message = message;
	}
	
	@Override 
	public String toString() {
		return "Fortune Cookie surprise: " + message;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Your quote is: " + this.message + "\n");
	}
	
	public static FortuneCookie generate() {
		int select = rand.nextInt(messages.length);
		FortuneCookie cookie = new FortuneCookie(messages[select]);
		return cookie;
	}
	
}

