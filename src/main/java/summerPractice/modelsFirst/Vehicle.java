package summerPractice.modelsFirst;

import java.math.BigDecimal;

public abstract class Vehicle {
    protected Long id;
    protected String type;
    protected String model;
    protected BigDecimal price;
    protected String fuelType;

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
}
