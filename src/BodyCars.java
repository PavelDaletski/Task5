import java.util.Objects;

public class BodyCars {
        private int idBodyCars;
        private int price;
        private String ModelBodycars;

        public BodyCars(){

        }

        public BodyCars(int idBodyCars, int price, String modelBodycars) {
            this.idBodyCars = idBodyCars;
            this.price = price;
            ModelBodycars = modelBodycars;
        }

        public int getIdBodyCars() {
            return idBodyCars;
        }

        public void setIdBodyCars(int idBodyCars) {
            this.idBodyCars = idBodyCars;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getModelBodycars() {
            return ModelBodycars;
        }

        public void setModelBodycars(String modelBodycars) {
            ModelBodycars = modelBodycars;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BodyCars bodyCars = (BodyCars) o;
            return idBodyCars == bodyCars.idBodyCars &&
                    price == bodyCars.price &&
                    Objects.equals(ModelBodycars, bodyCars.ModelBodycars);
        }

        @Override
        public int hashCode() {
            return Objects.hash(idBodyCars, price, ModelBodycars);
        }

        @Override
        public String toString() {
            return "BodyCars{" +
                    "idBodyCars=" + idBodyCars +
                    ", price=" + price +
                    ", ModelBodycars='" + ModelBodycars + '\'' +
                    '}';
        }
    }

