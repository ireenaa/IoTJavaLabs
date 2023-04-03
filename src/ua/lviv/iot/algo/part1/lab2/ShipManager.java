package ua.lviv.iot.algo.part1.lab2;
import ua.lviv.iot.algo.part1.lab1.Ship;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ShipManager {
    private static final List<Ship> ships = new LinkedList<>();

    public void addShip(Ship ship){
        this.ships.add(ship);
    }

    public static List<Ship> takeShipWithMaxSpeedMoreThanGiven(double choosenSpeed) {
        return ships.stream().
                filter(ship -> ship.getMaxSpeed() > choosenSpeed).
                collect(Collectors.toList());
    }

    public static List<Ship> chooseShipWhichCanAcommodateMoreThanChoosenCapacity(double choosenCapacity) {
        return ships.stream().
                filter(ship -> ship.getMaxCapacity() > choosenCapacity).
                collect(Collectors.toList());
    }



    public static void main(String[] args) {
        ShipManager shipManager = new ShipManager();
        shipManager.addShip(new Warship("Irenia", "Odessa", 250.0, 4500.0, 650.0, "artillery", "aviation", "Nimitz"));
        shipManager.addShip(new Warship("Velox", "Tokyo", 350.0, 5000, 574.0, "rocket", "marines", "Nimitz"));
        shipManager.addShip(new Tanker("Knock Nevis", "LA", 325.0, 800.0, 670.0, 450.0f, 1200.0f));
        shipManager.addShip(new Tanker("Nina", "LA", 470.0, 674.0, 580.0, 560.0f, 765.0f));
        shipManager.addShip(new CargoShip("Joseph", "LA", 530.0, 1000.0, 800.0, 750, "cars"));
        shipManager.addShip(new CargoShip("Shelters", "Busan", 570.0, 487.0, 549.0, 600, "tractors"));
        shipManager.addShip(new CruiseShip("Titanyk", "Signapore", 250.0, 456.0, 500.0, 3000, 300, 200));
        shipManager.addShip(new CruiseShip("Alaska", "Ambarli", 300.0, 475.0, 670.0, 1500, 150, 80));

        for (Ship  ship : shipManager.ships) {
            System.out.println(ship);}
        var shipWithMaxSpeedMoreThanGiven = ShipManager.takeShipWithMaxSpeedMoreThanGiven(300.0);
        System.out.println("Ship with more max speed than given ");
        for (
                Ship ship : shipWithMaxSpeedMoreThanGiven) {
            System.out.println(ship);
        }


        var shipWhichCanAcommodateMoreThanChoosenCapacity = ShipManager.chooseShipWhichCanAcommodateMoreThanChoosenCapacity(500.0);
        System.out.println("Ship which can accomodate more capacity then choosed");
        for (
                Ship ship : shipWhichCanAcommodateMoreThanChoosenCapacity) {
            System.out.println(ship);
        }
    }
}