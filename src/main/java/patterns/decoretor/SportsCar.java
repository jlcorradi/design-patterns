package patterns.decoretor;

public class SportsCar extends CarDecorator {
    protected SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("\nAdding features to Sports card");
    }
}
