package patterns.frontcontroller;

public class ConsoleUI {

    public static void main(String[] args) {
        FrontController fc = new FrontController();
        fc.dispatchRequest("Home");
        fc.dispatchRequest("Student");
    }

}
