package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.stream.Stream;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public abstract class Ship {
    private static final double ID = 10.4;

    private String name;

    private String currentPort;

    private double maxSpeed;

    private double maxCapacity;

    private double currentLoad;

    public abstract int getTotalPeopleCount();
    public abstract int calculateLoadTime();

    public String getHeader() {
        return "currentPort,currentLoad,name,maxCapacity,maxSpeed\n";
    }

    public String toCSV() {
        return this.currentPort + ","+ this.currentLoad + "," + this.name + "," + this.maxCapacity + "," + this.maxSpeed + "\n";
    }
}

