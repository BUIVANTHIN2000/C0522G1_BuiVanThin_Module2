package bailamthemoop1.sevice.impl;

import bailamthemoop1.model.Car;
import bailamthemoop1.sevice.ICarSevicer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSevicer implements ICarSevicer {
    private static List<Car> carList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Car car = infoCar();
carList.add(car);
    }

    @Override
    public void disPlay() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void search() {

    }

    public static Car infoCar() {
        System.out.print("Enter sea of control: ");
        String seOfControl = scanner.nextLine();
        System.out.print("Enter manufacture name: ");
        String manufatureName = scanner.nextLine();
        System.out.print("Enter Owner: ");
        String owner = scanner.nextLine();
        System.out.print("Enter number of seats: ");
        String numberOfSeats = scanner.nextLine();
        System.out.print("Enter vihecle type: ");
        String vihecleType = scanner.nextLine();
        Car car = new Car(seOfControl, manufatureName, owner, numberOfSeats, vihecleType);
        return car;
    }
}
