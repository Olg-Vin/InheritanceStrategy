package summerPractice.modelsFirst;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "bike")
public class Bike extends Vehicle{
    private final static String type = "BIKE";
    protected Bike() {
    }
    public Bike(String model, BigDecimal price, String fuelType) {
        super(type, model, price, fuelType);
    }
    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
