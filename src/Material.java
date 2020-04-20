import java.time.LocalDateTime;

public abstract class Material {

    protected String id ;
    protected String name;
    protected double cost;

    public String getId() {
        return id;
    }

    public Material setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Material setName(String name) {
        this.name = name;
        return this;
    }


    public double getCost() {
        return cost;
    }

    public Material setCost(double cost) {
        this.cost = cost;
        return this;
    }

    protected abstract double calculatorMoney();
    protected abstract String dateOfManufacture();
}
