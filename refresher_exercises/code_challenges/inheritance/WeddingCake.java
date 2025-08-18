package refresher_exercises.code_challenges.inheritance;

class WeddingCake extends Cake {
    /*
     * TODO: Your code goes here.
     * This class must inherit from Cake.
     * It should have a field called tiers.
     * Create a getter and setter method for tiers.
     * The default flavor of a wedding cake should be almond.
     */
    private int tiers;

    public WeddingCake() {
        super("Almond");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    @Override
    public String toString() {
        return "WeddingCake{" +
                "flavor=" + getFlavor() +
                " price=" + getPrice() +
                " tiers=" + tiers +
                '}';
    }
}
