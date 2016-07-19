public class PolarPoint implements Point {
    private double radius;
    private int angle;

    public PolarPoint(double radius, int angle) {
        this.radius = radius;
        this.angle = angle;
    }

    public double getRadius() {
        return radius;
    }

    public double getAngle() {
        return angle;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

}
