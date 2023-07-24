package encapsulatingclass;

/**
 * This class represents a player of the game.
 */
public final class Player {
    /**
     * The player's name.
     */
    private final String playerName;

    /**
     * Constructs a Player object with the given name.
     *
     * @param name The player's name.
     */
    public Player(final String name) {
        this.playerName = name;
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
