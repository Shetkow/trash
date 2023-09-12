package Abstract;

public class Rectangle extends Shape{
    public Rectangle(int a, int b) {
        super(a, b);
    }
    @Override
    public int getPeremitr(){
        return (getA() + getB()) *2;
    }
}
