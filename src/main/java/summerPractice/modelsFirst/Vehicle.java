package summerPractice.modelsFirst;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "vehicle")
// strategy "one table - one class"
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Vehicle {
    @Id
    // todo which strategy to choose for id
    @GeneratedValue(strategy = GenerationType.TABLE)
    protected Long id;
    protected String type;
    protected String model;
    protected BigDecimal price;
    protected String fuelType;
    protected Vehicle() { // none constructor for hibernate
    }

    public Vehicle(String type, String model, BigDecimal price, String fuelType) {
//        this.id = id;
        this.type = type;
        this.model = model;
        this.price = price;
        this.fuelType = fuelType;
    }

    public Long getId() {
        return id;
    }

    protected void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    protected void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    protected void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFuelType() {
        return fuelType;
    }

    protected void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
