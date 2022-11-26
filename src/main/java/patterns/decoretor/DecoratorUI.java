package patterns.decoretor;

public class DecoratorUI {
    public static void main(String[] args) {
        Car suv = new SuvCar(new BasicCar());
        suv.assemble();

        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
    }
}
