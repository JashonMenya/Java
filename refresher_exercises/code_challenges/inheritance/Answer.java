package refresher_exercises.code_challenges.inheritance;

class Answer {

    // Do not change this method
    static Cake createCake() {
        Cake cake = new Cake();
        cake.setPrice(29.99);
        return cake;
    }

    // Do not change this method
    static BirthdayCake createBirthdayCake() {
        return new BirthdayCake();
    }

    static WeddingCake createWeddingCake() {
        WeddingCake weddingCake = new WeddingCake();

        // TODO: Set the price and flavor by uncommenting the next 2 lines
        weddingCake.setFlavor("pina colada");
        weddingCake.setPrice(350);

        return weddingCake;
    }

    public static void main(String[] args) {
        System.out.println("Starting bakery...");
        var cake = Answer.createCake();
        var birthdayCake = Answer.createBirthdayCake();
        var weddingCake = Answer.createWeddingCake();

        System.out.println(weddingCake);
    }

}