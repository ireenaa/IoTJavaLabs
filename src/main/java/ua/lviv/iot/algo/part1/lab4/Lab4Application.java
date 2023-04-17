package ua.lviv.iot.algo.part1.lab4;

import ua.lviv.iot.algo.part1.lab1.Ship;
import ua.lviv.iot.algo.part1.lab2.CargoShip;
import ua.lviv.iot.algo.part1.lab2.CruiseShip;
import ua.lviv.iot.algo.part1.lab2.Tanker;
import ua.lviv.iot.algo.part1.lab2.Warship;

import java.util.ArrayList;

public class Lab4Application {

    public static void main(String[] args) {
        Ship ship1 = new CargoShip("Joseph", "LA", 530.0, 1000.0, 800.0, 750, "cars");
        Ship ship2 = new CruiseShip("Titanyk", "Signapore", 250.0, 456.0, 500.0, 3000, 300, 200);
        Ship ship3 = new Tanker("Nina", "LA", 100.0, 674.0, 580.0, 560.0f, 765.0f);
        Ship ship4 = new Warship("Velox", "Tokyo", 350.0, 5000, 574.0, "rocket", "marines", "Nimitz");

        ArrayList<Ship> ships = new ArrayList<>();
        ships.add(ship1);
        ships.add(ship2);
        ships.add(ship3);
        ships.add(ship4);

        ShipWriter writer = new ShipWriter();

        writer.writeToFile(ships);
    }
}
