package summerPractice.modelsFirst;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "truck")
public class Truck extends Vehicle{
    protected Double loadCapacity;
}
