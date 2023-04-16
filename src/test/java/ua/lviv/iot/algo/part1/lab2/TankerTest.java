package ua.lviv.iot.algo.part1.lab2;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

public class TankerTest {
    Tanker ship = new Tanker("Knock Nevis", "LA", 325.0, 800.0, 670.0, 450.0f, 1200.0f);

    @Test
    public void testGetTotalPeopleCount(){
        var ship = new Tanker();
        ship.toString();
        ship.setLengthOfShip(8);
        assertEquals(0, ship.getTotalPeopleCount());
    }

    @Test
    public void testCalculateLoadTime(){
        var ship = new Tanker();
        assertEquals(0,ship.calculateLoadTime());
    }
    @Test
    public void testGetVolume(){
        assertEquals(1200.0f, ship.getVolume());
    }
    @Test
    public void testGetLengthOfShip(){
        assertEquals(450.0f, ship.getLengthOfShip());
    }

}