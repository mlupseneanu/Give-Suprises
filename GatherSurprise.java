package surprise;

import java.util.Random;

import surprise.surprises.Candies;
import surprise.surprises.FortuneCookie;
import surprise.surprises.ISurprise;
import surprise.surprises.MinionToy;

public final class GatherSurprise {
  
  private static final Random rand = new Random();
  
  private GatherSurprise() {}
  
  public static ISurprise gather() {
    int type = rand.nextInt();
    switch(type) {
      case 0:
        return FortuneCookie.generate();
      case 1:
        return Candies.generate();
      case 2:
        return MinionToy.generate();
      default:
         System.out.println("Error: No surprise matches this type");
         return null;
      }
  }
  
  public static ISurprise[] gather(int n) {
    ISurprise[] surprises = new ISurprise[n];
    for(int i = 0; i < n; i++) {
      surprises[i] = gather();
    }
    return surprises;
  }
}