import java.util.Objects;

public class Engine {
    private int idEngine;
    private int price;
    private String EngineModel;


    public Engine() {

    }


    public Engine(int idEngine, int price, String engineModel) {
        this.idEngine = idEngine;
        this.price = price;
        EngineModel = engineModel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "idEngine=" + idEngine +
                ", price=" + price +
                ", EngineModel='" + EngineModel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return idEngine == engine.idEngine &&
                price == engine.price &&
                Objects.equals(EngineModel, engine.EngineModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEngine, price, EngineModel);
    }

    public int getIdEngine() {
        return idEngine;
    }

    public void setIdEngine(int idEngine) {
        this.idEngine = idEngine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEngineModel() {
        return EngineModel;
    }

    public void setEngineModel(String engineModel) {
        EngineModel = engineModel;
    }
}