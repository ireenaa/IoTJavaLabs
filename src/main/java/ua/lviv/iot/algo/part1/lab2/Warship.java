package ua.lviv.iot.algo.part1.lab2;
import ua.lviv.iot.algo.part1.lab1.Ship;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Warship extends Ship {
    private String typeOfWeapon;
    private String interactsWith;
    private String shipClass;

    public Warship(String name,
                   String currentPort,
                   double maxSpeed,
                   double maxCapacity,
                   double currentLoad,
                   String typeOfWeapon,
                   String interactsWith,
                   String shipClass)
    {
        super(name, currentPort, maxSpeed, maxCapacity, currentLoad);
        this.typeOfWeapon = typeOfWeapon;
        this.interactsWith = interactsWith;
        this.shipClass = shipClass;
    }
    @Override
    public int getTotalPeopleCount() {
        return 0;
    }
    @Override
    public int calculateLoadTime() {
        return 0;
    }
}