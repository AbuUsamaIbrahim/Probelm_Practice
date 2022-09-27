package designPattern.diPattern.simpleDI;

public class Drawing {
    private Shape shape = new Triangle();

    public void setShape(Shape shape) {
        this.shape = shape;
    }
    public void draw(){
        this.shape.draw();
    }
}
