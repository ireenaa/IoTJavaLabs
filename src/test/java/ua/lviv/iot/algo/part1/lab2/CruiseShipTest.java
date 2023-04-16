package ua.lviv.iot.algo.part1.lab2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CruiseShipTest {
   CruiseShip ship = new CruiseShip("Titanyk", "Signapore", 250.0, 456.0, 500.0, 3000, 300, 200);

   @Test
   public void testGetTotalPeopleCount(){
      var ship = new CruiseShip();
      ship.toString();
      ship.setPassangersCount(200);
      ship.setCrewCount(300);
      ship.setSupportStaffCount(200);
      assertEquals(700, ship.getTotalPeopleCount());

   }

   @Test
   public void testCalculateLoadTime()
   {
      assertEquals(17500, ship.calculateLoadTime());
   }
   @Test
   public void testGetPassangersCount(){
      assertEquals(3000, ship.getPassangersCount());
   }
   @Test
   public void testSetSupportStaffCount(){
      assertEquals(200, ship.getSupportStaffCount());
   }
   @Test
   public void getCrewCount(){
      assertEquals(300, ship.getCrewCount());
   }

}