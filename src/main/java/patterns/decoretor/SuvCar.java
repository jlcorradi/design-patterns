package patterns.decoretor;

public class SuvCar extends CarDecorator{
    protected SuvCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("\nMaking the car a SUV");
    }
}
