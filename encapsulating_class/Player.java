package encapsulating_class;

/**
 * This class represents a player of the game.
 */
public class Player {

    private String playerName;

    /*
     * Add a constructor that takes a name.
     */
    public Player(String n) {
        playerName = n;
    }

    /*
     * Add a method that returns the player's name.
     */
    public String getPlayerName() {
        return playerName;
    }

}
