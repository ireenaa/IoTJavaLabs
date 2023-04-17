package ua.lviv.iot.algo.part1.lab2;
import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class CargoShipTest  {
    CargoShip ship = new CargoShip("Shelters", "Busan", 570.0, 487.0, 549.0, 600, "tractors");

    @Test
    public void testCalculateLoadTime(){
        assertEquals(1800, ship.calculateLoadTime());
    }

    @Test
    public void testGetTotalPeopleCount(){
        CargoShip ship = new CargoShip("Joseph", "LA", 530.0, 1000.0, 800.0, 750, "cars");
        assertEquals(0, ship.getTotalPeopleCount());
    }
}


