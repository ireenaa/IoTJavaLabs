package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
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

    public void dock(String port) {
        this.currentPort = port;
    }

    public void setSpeed(double speed) {
        this.maxSpeed = speed;
    }

    public void load(double weight) {
        if (currentLoad + weight <= maxCapacity) {
            currentLoad += weight;
        }
    }

    public void unload(double weight) {
        if (currentLoad - weight > 0) {
            currentLoad -= weight;
        }
    }
    public abstract int getTotalPeopleCount();
    public abstract int calculateLoadTime();
}