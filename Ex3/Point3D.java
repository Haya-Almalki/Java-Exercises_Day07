public class Point3D extends Point2D{
    private float z=0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float array[]={this.getX(),this.getY(),this.z};

        return array;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "(" +this.getX()+
                "," +this.getY()+"," +z +
                ')';
    }
}
