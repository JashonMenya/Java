package refresher_exercises.sandbox;

import refresher_exercises.objects_classes.Car;

import java.util.Scanner;

public class MainArrayExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();
        Car testCar = car.getCarInfo(scanner);
        System.out.println(testCar);

    }

}
