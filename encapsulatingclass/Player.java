package encapsulatingclass;

/**
 * This class represents a player of the game.
 */
public final class Player {

    private final String playerName;

    /**
     * Constructs a Player object with the given name.
     *
     * @param playerName The player's name.
     */
    public Player(final String playerName) {
        this.playerName = playerName;
    }

    /**
     * Returns the player's name.
     *
     * @return The player's name.
     */
    public String getPlayerName() {
        return playerName;
    }

}
