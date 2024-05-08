package classwork28.gadgets;

public class Conditioner implements RemoteController {

    @Override
    public void on() {
        System.out.println("Conditioner is on");
    }

    @Override
    public void off() {
        System.out.println("Conditioner is off");
    }

    @Override
    public void plus() {
        System.out.println("Conditioner make plus");
    }

    @Override
    public void minus() {
        System.out.println("Conditioner make minus");
    }
}
