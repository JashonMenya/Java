package refresher_exercises.objects_classes;


import java.util.Scanner;

public class Car {

    private String make;
    private String model;
    private int year;
    private String color;

    public Car() {

    }

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Car [Make: %s, Model: %s, Year: %d, Color: %s]", make, model, year, color);
    }

    public Car buildCar(String make, String model, int year, String color) {

        Car car = new Car(make, model, year, color);

        return car;
    }

    public Car getCarInfo(Scanner scanner) {
        System.out.println("Car make? ");
        String carMake = scanner.nextLine();

        System.out.println("Car model? ");
        String carModel = scanner.nextLine();

        System.out.println("Production year? ");
        int prodYear = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Car color? ");
        String carColor = scanner.nextLine();

        return buildCar(carMake, carModel, prodYear, carColor);

    }

}
