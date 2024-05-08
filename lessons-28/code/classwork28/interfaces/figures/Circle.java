package classwork28.interfaces.figures;

public class Circle implements Drawable, Fillable {
    @Override
    public void draw() {
        System.out.println("рисуем круг");
    }

    @Override
    public void fill() {
        System.out.println("закрашиваем круг");
    }
}