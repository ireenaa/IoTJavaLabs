package ua.lviv.iot.algo.part1.lab2;
import ua.lviv.iot.algo.part1.lab1.Ship;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
public class ShipManager {
    private static final List<Ship> shipList = new LinkedList<Ship>();

    public void addShip(Ship ship) {
        this.shipList.add(ship);
    }

    public static List<Ship> getShipWithMaxSpeedThan(double choosenSpeed){
        return shipList.stream().
                filter(ship -> ship.getMaxSpeed() > choosenSpeed).
                collect(Collectors.toList());
    }

    public static List<Ship> getShipWichAcommodateMoreThan(double choosenCapacity){
        return shipList.stream().
                filter(ship -> ship.getMaxCapacity() > choosenCapacity).
                collect(Collectors.toList());
    }
}