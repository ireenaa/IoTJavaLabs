package ua.lviv.iot.algo.part1.lab2;
import ua.lviv.iot.algo.part1.lab1.Ship;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class CargoShip extends Ship {
    private int tonnage;
    private String typeOfCargo;
    private static final int TIME_OF_LOADING_CARGO = 60;
    private static final int AMOUNT_OF_CARGO = 20;

    public CargoShip(String name, String currentPort, double maxSpeed, double maxCapacity, double currentLoad, int tonnage, String typeOfCargo) {
        super(name, currentPort, maxSpeed, maxCapacity, currentLoad);
        this.tonnage = tonnage;
        this.typeOfCargo = typeOfCargo;
    }
    @Override
    public int getTotalPeopleCount() {
        return 0;
    }

    @Override
    public int calculateLoadTime( ) {
        return tonnage/AMOUNT_OF_CARGO * TIME_OF_LOADING_CARGO;
    }
}