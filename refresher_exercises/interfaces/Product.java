package refresher_exercises.interfaces;

public interface Product {
    public String name = "Book";


    String getName();
    void setName(String name);
    default void setPrice(double price){};

    default double getPrice() {
        return 50;
    };
}
