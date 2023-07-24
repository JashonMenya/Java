package encapsulatingclass;

/**
 * This class represents a team of players.
 */
public final class Team {
    /**
     * The team's name.
     */
    private String teamName;

    /**
     * An array of players in the team.
     */
    private Player[] playerArray;

    /**
     * Constructs a Team object with the given team name
     * and an array of players.
     *
     * @param name    The team's name.
     * @param players An array of players in the team.
     */
    public Team(final String name, final Player[] players) {
        this.teamName = name;
        this.playerArray = players;
    }

    /**
     * Returns the array of players in the team.
     *
     * @return The array of players in the team.
     */
    public Player[] getPlayerArray() {
        return playerArray;
    }

    /**
     * Sets the array of players in the team.
     *
     * @param players An array of players to set in the team.
     */
    public void setPlayerArray(final Player[] players) {
        this.playerArray = players;
    }

    /**
     * Returns the team's name.
     *
     * @return The team's name.
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Sets the team's name.
     *
     * @param name The team's name to set.
     */
    public void setTeamName(final String name) {
        this.teamName = name;
    }
}
