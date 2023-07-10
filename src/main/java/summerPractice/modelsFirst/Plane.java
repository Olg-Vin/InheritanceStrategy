package summerPractice.modelsFirst;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "plane")
public class Plane extends Vehicle{
    protected Integer passengerCapacity;
}
