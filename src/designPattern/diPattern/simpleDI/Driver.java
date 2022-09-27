package designPattern.diPattern.simpleDI;

public class Driver {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.setShape(new Triangle());
        drawing.draw();
    }

}
