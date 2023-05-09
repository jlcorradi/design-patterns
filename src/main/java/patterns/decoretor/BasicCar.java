package patterns.decoretor;

import lombok.Data;

@Data
public class BasicCar implements Car{

    private Object childObject;

    @Override
    public void assemble() {
        System.out.println("Assembling basic Car");
    }
}
