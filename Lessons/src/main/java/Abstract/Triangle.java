package Abstract;

public class Triangle extends Shape{
private int h;
    public Triangle(int a, int b,int h) {
        super(a,b);
        this.h = h;
    }
    @Override
    public int getPeremitr(){
        return getA() + getB() + h;

    }

}
