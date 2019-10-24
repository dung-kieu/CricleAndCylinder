public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        super();
        this.height =2;
    };

    public Cylinder(double radius,String color,double height){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double VCylinder(){
        return getAre()*height;
    }

    @Override
    public String toString() {
        return "height : "
                + getHeight()
                + " , cylinder V :"
                + VCylinder();
    }
}
