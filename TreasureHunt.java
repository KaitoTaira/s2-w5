public class TreasureHunt {

    int [ ] myClues = {0, 3, 99, 8, 2, 7, 9, 9, 4, 5};
 
    public TreasureHunt ( ) {
      huntSucceeds(0);
    }
    
    // Plays the Treasure Hunt game, returning true
    // if we win and false if we lose..
    public boolean huntSucceeds (int start) {
       // You fill this in.
       return true;
    }

    public static void main(String[] args) {
      TreasureHunt t = new TreasureHunt();
      System.err.println(t.huntSucceeds(0));
    }
 }