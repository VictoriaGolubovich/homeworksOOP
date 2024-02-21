import model.ComplexNumber;
import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new ComplexNumber(5, 2),
                new ComplexNumber(2, -5));
        controller.start();
    }
}
