public class Test_Ex5 {

    public static void main(String[] args) {
        MyPoint p1=new MyPoint(5,10);
        MyPoint p2=new MyPoint(1,0);
        MyPoint p3=new MyPoint(3,4);
        
        MyTriangle triangle=new MyTriangle(p1,p2,p3);

        System.out.println(triangle);
        System.out.println("Perimeter= "+triangle.getPerimeter());
        System.out.println(triangle.printType());
    }
}
