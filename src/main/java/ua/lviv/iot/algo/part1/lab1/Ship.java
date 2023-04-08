package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public abstract class Ship {
    protected static final double ID = 10.4;

    protected String name;

    protected String currentPort;

    protected double maxSpeed;

    protected double maxCapacity;

    protected double currentLoad;

    public abstract int getTotalPeopleCount();
    public abstract int calculateLoadTime();
}