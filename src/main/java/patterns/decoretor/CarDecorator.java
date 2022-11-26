package patterns.decoretor;

public abstract class CarDecorator implements Car{

    private final Car car;

    protected CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
    }
}
