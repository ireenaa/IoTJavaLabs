package ua.lviv.iot.algo.part1.lab4;

import ua.lviv.iot.algo.part1.lab1.Ship;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ShipWriter {

    public void writeToFile(List<Ship> shipList) {
        boolean isHeaderNotPresent = true;
        try(FileWriter file = new FileWriter("ships.csv")) {
            for (Ship ship : shipList) {
                if (isHeaderNotPresent) {
                    file.write(ship.getHeader());
                    isHeaderNotPresent = false;
                }
                file.write(ship.toCSV());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
