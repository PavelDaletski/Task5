import java.util.Objects;

public class Car  extends Broadcast  implements CarDetali, Model {
    private int id;
    private String Mark;
    private Engine engine;
    private Transmission transmission;
    private BodyCars bodyCars;

    public Car() {

    }

    public Car(int id, String model, Engine engine, Transmission transmission, BodyCars bodyCars) {
        this.id = id;
        this.Mark = model;
        this.engine = engine;
        this.transmission = transmission;
        this.bodyCars = bodyCars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                Objects.equals(Mark, car.Mark) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(transmission, car.transmission) &&
                Objects.equals(bodyCars, car.bodyCars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Mark, engine, transmission, bodyCars);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return Mark;
    }

    public void setModel(String model) {
        this.Mark = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public BodyCars getBodyCars() {
        return bodyCars;
    }

    public void setBodyCars(BodyCars bodyCars) {
        this.bodyCars = bodyCars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + Mark + '\'' +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", bodyCars=" + bodyCars +
                '}';
    }

    @Override
    public void broadcastStrat() {

    }

    @Override
    public void broadstStop() {

    }

    public void broadcastStrat(String model) {
        System.out.println("передача машины " + model + " включена.");
    }

    public void broadstStop(String model) {
        System.out.println("передача машины " + model + " выключена.");
    }


    @Override
    public int getPrice() {
        return getEngine().getPrice() + getBodyCars().getPrice() + getEngine().getPrice();
    }

    @Override
    public int setPrice() {
        return setPrice();
    }

    @Override
    public String getModel() {
        return getEngine().getEngineModel() + getBodyCars().getModelBodycars() + getTransmission().getTransmissionModel();
    }



}
