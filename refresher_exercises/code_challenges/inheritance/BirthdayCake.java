package refresher_exercises.code_challenges.inheritance;

class BirthdayCake extends Cake {
    /*
     * TODO: Your code goes here.
     * It must inherit from the Cake class.
     * BirthdayCake should have a field of its own called candles.
     * This class should also contain a getter and setter method for candles.
     * The default flavor of a birthday cake should be chocolate.
     */

    private int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
