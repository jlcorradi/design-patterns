package patterns.decoretor;

import java.util.Optional;

public class DecoratorUI {
    public static void main(String[] args) {
        BasicCar basicCar = null;
        boolean present = Optional.ofNullable(basicCar)
                .map(BasicCar::getChildObject)
                .isPresent();

        System.out.format("Is Present: %s\n", present);

        Car suv = new SuvCar(new BasicCar());
        suv.assemble();

        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
    }
}
