package summerPractice.modelsFirst;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "car")
public class Car extends Vehicle{
    protected Integer seats;
    protected Car() { // for hibernate
    }

    public Car(String type, String model, BigDecimal price, String fuelType, Integer seats) {
        super(type, model, price, fuelType);
        this.seats = seats;
    }

    public Integer getSeats() {
        return seats;
    }

    protected void setSeats(Integer seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                '}';
    }
}
