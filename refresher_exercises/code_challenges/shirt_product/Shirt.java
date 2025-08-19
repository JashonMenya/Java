package refresher_exercises.code_challenges.shirt_product;

class Shirt implements Product {
    private String size;
    private String color;
    private String name;
    private double price;

    public Shirt(String name, double price, String size, String color) {
        setName(size);
        setPrice(price);
        setSize(size);
        setColor(color);
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
