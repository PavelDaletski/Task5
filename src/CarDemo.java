public class CarDemo {
   /* создать иерархию наследования на 3 уровня
    с абстрактным классом и 2-мя абстрактными методами, переопределить методы equals hashCode, toString,
    перегрузить и переопределить 2 метода в классах и конструкторах,
    продемонстрировать работу с массивами объектов из иерархии классов
            (сортировать по критериям, суммарный подсчет параметров и т.д.)
    Данная домашка дополнится после занятия в четверг (надо будет добавить имплементацию 2 своих интерфейсов).*/

    public static void main(String[] args) {
        Engine engine = new Engine(1, 6500, "TSI");
        Engine engine1 = new Engine(2, 7850, "TFSI");

        Transmission transmission = new Transmission(1, 4589,"DSG");
        Transmission transmission1 = new Transmission(2, 4125, "Robot");

        BodyCars bodyCars = new BodyCars(1, 3465, "Sedan");
        BodyCars bodyCars1 = new BodyCars(2,2879, "Hatchbak" );


        Car car1 = new Car(1,"Ford focus", engine1, transmission1, bodyCars1);
        Car car2 = new Car(2, "Skoda Rapid", engine, transmission, bodyCars);




        car1.broadcastStrat();
        car2.broadstStop();


        car1.broadcastStrat(car1.getMark());
        car2.broadstStop(car2.getMark());




        System.out.println(car1.getPrice());
        System.out.println(car2.getPrice());
    }

}
