import java.util.Objects;

public class Transmission  extends Broadcast{
    private int idTransmission;
    private int price;
    private String TransmissionModel;

    public Transmission(){

    }

    public Transmission(int idTransmission, int price, String transmissionModel) {
        this.idTransmission = idTransmission;
        this.price = price;
        TransmissionModel = transmissionModel;
    }

    public int getIdTransmission() {
        return idTransmission;
    }

    public void setIdTransmission(int idTransmission) {
        this.idTransmission = idTransmission;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTransmissionModel() {
        return TransmissionModel;
    }

    public void setTransmissionModel(String transmissionModel) {
        TransmissionModel = transmissionModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transmission that = (Transmission) o;
        return idTransmission == that.idTransmission &&
                price == that.price &&
                Objects.equals(TransmissionModel, that.TransmissionModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransmission, price, TransmissionModel);
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "idTransmission=" + idTransmission +
                ", price=" + price +
                ", TransmissionModel='" + TransmissionModel + '\'' +
                '}';
    }


    @Override
     public void broadcastStrat() {
        System.out.println("Передача включена ");

    }

    @Override
    public void broadstStop() {
        System.out.println("передача выключина ");

    }


}


