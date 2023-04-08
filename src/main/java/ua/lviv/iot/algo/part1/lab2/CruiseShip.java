package ua.lviv.iot.algo.part1.lab2;
import ua.lviv.iot.algo.part1.lab1.Ship;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)

public class CruiseShip extends Ship {
    private int passangersCount;
    private int crewCount;
    private int supportStaffCount;
    private static final int TIME_OF_LOADING_ONE_PERSON = 5;

    public CruiseShip(String name,
                      String currentPort,
                      double maxSpeed,
                      double maxCapacity,
                      double currentLoad,
                      int passangersCount,
                      int crewCount,
                      int supportStaffCount)
    {
        super(name, currentPort, maxSpeed, maxCapacity, currentLoad);
        this.passangersCount = passangersCount;
        this.crewCount = crewCount;
        this.supportStaffCount =supportStaffCount;
    }

    @Override
    public int getTotalPeopleCount() {
        return this.passangersCount + this.crewCount + this.supportStaffCount;
    }

    @Override
    public int calculateLoadTime() {
        return TIME_OF_LOADING_ONE_PERSON * this.getTotalPeopleCount();
    }
}