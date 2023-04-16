package ua.lviv.iot.algo.part1.lab2;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ua.lviv.iot.algo.part1.lab1.Ship;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class Tanker extends Ship {
    private float lengthOfShip;
    private float volume;

    public Tanker(String name,
                  String currentPort,
                  double maxSpeed,
                  double maxCapacity,
                  double currentLoad,
                  float lengthOfShip,
                  float volume)
    {
        super(name, currentPort, maxSpeed, maxCapacity, currentLoad);
        this.lengthOfShip = lengthOfShip;
        this.volume = volume;
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