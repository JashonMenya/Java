package refresher_exercises.code_challenges.shirt_product;

public class MainSp {
    public static void main(String[] args) {
        String name = "Golf Shirt";
        double price = 49.95;
        String color = "White";
        String size = "Medium";
        Shirt shirt = buyShirt(name, price, size, color);

        System.out.println(shirt);

    }

    // Do not change this method
    static Shirt buyShirt(String name, double price, String size, String color) {
        return new Shirt(name, price, size, color);
    }
}
