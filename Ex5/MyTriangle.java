public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimeter() {

        return v1.distance(v2.getX(), v2.getY()) + v2.distance(v3.getX(),v3.getY()) + v3.distance(v1.getX(),v1.getY());
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public String printType() {
        double d12 = v1.distance(v2.getX(), v2.getY());
        double d23 = v2.distance(v3.getX(),v3.getY());
        double d31 = v3.distance(v1.getX(), v1.getY());
        if ((d12 == d23) && (d23 == d31)) {
            return "equilateral";
        } else if ((d12 == d23) || (d12 == d31) || (d23 == d31)) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
