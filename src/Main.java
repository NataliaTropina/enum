public class Main {
    public static void main(String[] args) {


        Car toyota = new Car("Toyota", 60, Fuel.PETROL95);
        Car ford = new Car("Ford", 80, Fuel.DIESEL);
        Car mercedes = new Car("Mercedes", 60, Fuel.PETROL98);

        System.out.println(toyota.fullTankCost());
        System.out.println(ford.fullTankCost());
        System.out.println(mercedes.fullTankCost());

    }
}