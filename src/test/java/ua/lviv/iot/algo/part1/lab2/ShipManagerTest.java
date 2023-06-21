package ua.lviv.iot.algo.part1.lab2;

import junit.framework.TestCase;
import org.junit.Test;
import ua.lviv.iot.algo.part1.lab1.Ship;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShipManagerTest extends TestCase {
    ShipManager Ships= new ShipManager();
    @Test
    public void testGetShipWithMaxSpeedThan() {
        Ships.addShip(new Warship("Irenia", "Odessa", 250.0, 4500.0, 650.0, "artillery", "aviation", "Nimitz"));
        Ships.addShip(new Warship("Velox", "Tokyo", 350.0, 5000, 574.0, "rocket", "marines", "Nimitz"));
        Ships.addShip(new Tanker("Knock Nevis", "LA", 325.0, 800.0, 670.0, 450.0f, 1200.0f));
        Ships.addShip(new Tanker("Nina", "LA", 470.0, 674.0, 580.0, 560.0f, 765.0f));
        Ships.addShip(new CargoShip("Joseph", "LA", 530.0, 1000.0, 800.0, 750, "cars"));
        Ships.addShip(new CargoShip("Shelters", "Busan", 570.0, 487.0, 549.0, 600, "tractors"));
        Ships.addShip(new CruiseShip("Titanyk", "Signapore", 250.0, 456.0, 500.0, 3000, 300, 200));
        Ships.addShip(new CruiseShip("Alaska", "Ambarli", 300.0, 475.0, 670.0, 1500, 150, 80));
        List<Ship> neededShip= new LinkedList<Ship>();
        neededShip.add(new Tanker("Nina", "LA", 470.0, 674.0, 580.0, 560.0f, 765.0f));
        neededShip.add(new CargoShip("Joseph", "LA", 530.0, 1000.0, 800.0, 750, "cars"));
        neededShip.add(new CargoShip("Shelters", "Busan", 570.0, 487.0, 549.0, 600, "tractors"));
        assertEquals(neededShip.size(), Ships.getShipWithMaxSpeedThan(400.0).size());
    }
    @Test
    public void testGetEmptyListOfShipsWithMaxSpeedThan(){
        Ships.addShip(new Warship("Irenia", "Odessa", 250.0, 4500.0, 650.0, "artillery", "aviation", "Nimitz"));
        Ships.addShip(new Warship("Velox", "Tokyo", 350.0, 5000, 574.0, "rocket", "marines", "Nimitz"));
        Ships.addShip(new Tanker("Knock Nevis", "LA", 325.0, 800.0, 670.0, 450.0f, 1200.0f));
        Ships.addShip(new Tanker("Nina", "LA", 100.0, 674.0, 580.0, 560.0f, 765.0f));
        Ships.addShip(new CargoShip("Joseph", "LA", 200.0, 1000.0, 800.0, 750, "cars"));
        Ships.addShip(new CargoShip("Shelters", "Busan", 240.0, 487.0, 549.0, 600, "tractors"));
        Ships.addShip(new CruiseShip("Titanyk", "Signapore", 250.0, 456.0, 500.0, 3000, 300, 200));
        Ships.addShip(new CruiseShip("Alaska", "Ambarli", 300.0, 475.0, 670.0, 1500, 150, 80));
        List<Ship> neededShip= new LinkedList<Ship>();
        assertEquals(neededShip.size(), Ships.getShipWithMaxSpeedThan(400.0).size());
    }
    @Test
    public void testGetAllRightShips(){
        Ships.addShip(new Warship("Irenia", "Odessa", 570.0, 4500.0, 650.0, "artillery", "aviation", "Nimitz"));
        Ships.addShip(new Warship("Velox", "Tokyo", 690.0, 5000, 574.0, "rocket", "marines", "Nimitz"));
        Ships.addShip(new Tanker("Knock Nevis", "LA", 560.0, 800.0, 670.0, 450.0f, 1200.0f));
        Ships.addShip(new Tanker("Nina", "LA", 401.0, 674.0, 580.0, 560.0f, 765.0f));
        List<Ship> neededShip= new LinkedList<Ship>();
        neededShip.add(new Warship("Irenia", "Odessa", 570.0, 4500.0, 650.0, "artillery", "aviation", "Nimitz"));
        neededShip.add(new Warship("Velox", "Tokyo", 690.0, 5000, 574.0, "rocket", "marines", "Nimitz"));
        neededShip.add(new Tanker("Knock Nevis", "LA", 560.0, 800.0, 670.0, 450.0f, 1200.0f));
        neededShip.add(new Tanker("Nina", "LA", 401.0, 674.0, 580.0, 560.0f, 765.0f));
        assertEquals(neededShip.size(), Ships.getShipWithMaxSpeedThan(400.0).size());
    }

    @Test
    public void testGetShipWichAcommodateMoreThan() {
        Ships.addShip(new Warship("Irenia", "Odessa", 250.0, 4500.0, 650.0, "artillery", "aviation", "Nimitz"));
        Ships.addShip(new Warship("Velox", "Tokyo", 350.0, 5000, 574.0, "rocket", "marines", "Nimitz"));
        Ships.addShip(new Tanker("Knock Nevis", "LA", 325.0, 800.0, 670.0, 450.0f, 1200.0f));
        Ships.addShip(new Tanker("Nina", "LA", 470.0, 674.0, 580.0, 560.0f, 765.0f));
        Ships.addShip(new CargoShip("Joseph", "LA", 530.0, 1000.0, 800.0, 750, "cars"));
        Ships.addShip(new CargoShip("Shelters", "Busan", 570.0, 487.0, 549.0, 600, "tractors"));
        Ships.addShip(new CruiseShip("Titanyk", "Signapore", 250.0, 456.0, 500.0, 3000, 300, 200));
        Ships.addShip(new CruiseShip("Alaska", "Ambarli", 300.0, 475.0, 670.0, 1500, 150, 80));
        List<Ship> neededShip= new ArrayList<Ship>();
        neededShip.add(new Warship("Irenia", "Odessa", 250.0, 4500.0, 650.0, "artillery", "aviation", "Nimitz"));
        neededShip.add(new Warship("Velox", "Tokyo", 350.0, 5000, 574.0, "rocket", "marines", "Nimitz"));
        neededShip.add(new Tanker("Knock Nevis", "LA", 325.0, 800.0, 670.0, 450.0f, 1200.0f));
        neededShip.add(new Tanker("Nina", "LA", 470.0, 674.0, 580.0, 560.0f, 765.0f));
        neededShip.add(new CargoShip("Joseph", "LA", 530.0, 1000.0, 800.0, 750, "cars"));
        assertEquals(neededShip.size(), Ships.getShipWichAcommodateMoreThan(500.0).size());
    }
    @Test
    public void testGetAllShips() {
        Ships.addShip(new Warship("Irenia", "Odessa", 250.0, 4500.0, 650.0, "artillery", "aviation", "Nimitz"));
        Ships.addShip(new Warship("Velox", "Tokyo", 350.0, 5000, 574.0, "rocket", "marines", "Nimitz"));
        Ships.addShip(new Tanker("Knock Nevis", "LA", 325.0, 800.0, 670.0, 450.0f, 1200.0f));
        Ships.addShip(new Tanker("Nina", "LA", 470.0, 674.0, 580.0, 560.0f, 765.0f));
        Ships.addShip(new CargoShip("Joseph", "LA", 530.0, 1000.0, 800.0, 750, "cars"));
        List<Ship> neededShip= new ArrayList<Ship>();
        neededShip.add(new Warship("Irenia", "Odessa", 250.0, 4500.0, 650.0, "artillery", "aviation", "Nimitz"));
        neededShip.add(new Warship("Velox", "Tokyo", 350.0, 5000, 574.0, "rocket", "marines", "Nimitz"));
        neededShip.add(new Tanker("Knock Nevis", "LA", 325.0, 800.0, 670.0, 450.0f, 1200.0f));
        neededShip.add(new Tanker("Nina", "LA", 470.0, 674.0, 580.0, 560.0f, 765.0f));
        neededShip.add(new CargoShip("Joseph", "LA", 530.0, 1000.0, 800.0, 750, "cars"));
        assertEquals(neededShip.size(), Ships.getShipWichAcommodateMoreThan(500.0).size());
    }
    @Test
    public void testGetEmptyListOfSipsWithCapacity() {
        Ships.addShip(new Warship("Irenia", "Odessa", 250.0, 300.0, 650.0, "artillery", "aviation", "Nimitz"));
        Ships.addShip(new Warship("Velox", "Tokyo", 350.0, 200.0, 574.0, "rocket", "marines", "Nimitz"));
        Ships.addShip(new Tanker("Knock Nevis", "LA", 325.0, 300.0, 670.0, 450.0f, 1200.0f));
        Ships.addShip(new Tanker("Nina", "LA", 470.0, 400.0, 580.0, 560.0f, 765.0f));
        List<Ship> neededShip= new ArrayList<Ship>();
        assertEquals(neededShip.size(), Ships.getShipWichAcommodateMoreThan(500.0).size());
    }
    @Test
    public void testAddShip() {
        List<Ship> Ship=new ArrayList<Ship>();
        Ship.add(new Warship("Irenia", "Odessa", 250.0, 4500.0, 650.0, "artillery", "aviation", "Nimitz"));
        Ship.add(new Warship("Velox", "Tokyo", 350.0, 5000, 574.0, "rocket", "marines", "Nimitz"));
        Ship.add(new Tanker("Knock Nevis", "LA", 325.0, 800.0, 670.0, 450.0f, 1200.0f));
        Ship.add(new Tanker("Nina", "LA", 470.0, 674.0, 580.0, 560.0f, 765.0f));
        Ship.add(new CargoShip("Joseph", "LA", 530.0, 1000.0, 800.0, 750, "cars"));
        Ship.add(new CargoShip("Shelters", "Busan", 570.0, 487.0, 549.0, 600, "tractors"));
        Ship.add(new CruiseShip("Titanyk", "Signapore", 250.0, 456.0, 500.0, 3000, 300, 200));
        Ship.add(new CruiseShip("Alaska", "Ambarli", 300.0, 475.0, 670.0, 1500, 150, 80));
        assertEquals(8, Ship.size());
    }
    @Test
    public void testEmptyList() {
        List<Ship> Ship=new ArrayList<Ship>();
        assertEquals(0, Ship.size());
    }
}