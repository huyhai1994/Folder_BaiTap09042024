package circle;

public class Circle {
    private int id;
    private double radius;
    final static double PI = 3.14159265358979323846;
    static int objectNumber;
    static double[] radiusArray = new double[10];
    static double[] areaArray = new double  [10];
    static double maxRadius = 0;

    public Circle(int id, double radius) {
        objectNumber++;
        boolean isMaxRadius = radius > maxRadius;
        if (isMaxRadius) maxRadius = radius;
        this.id = id;
        this.radius = radius;
        this.putObjectRadiusIntoArrayList(radius);
        this.putObjectAreaIntoArrayList();
    }

    public int getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getObjectNumber() {
        return objectNumber;
    }

    public double getAreaOfCircle() {
        return (int) (PI * radius * radius);
    }

    public void putObjectRadiusIntoArrayList(double radius) {
        int objectIndex = objectNumber - 1;
        radiusArray[objectIndex] = radius;
    }

    public void putObjectAreaIntoArrayList() {
        int objectIndex = objectNumber - 1;
        areaArray[objectIndex] = getAreaOfCircle();
    }


}
