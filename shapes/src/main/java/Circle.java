public class Circle extends Shapes {



    private int radius;
    private final long pi = (long) 3.142;
    private long area;
    private long perimeter;

//    public Circle(int radius) {
//        this.radius = radius;
//    }
    public void calculatePrimeter(int radius) {
        long perimeter = pi *radius;
        System.out.println(perimeter);

    }

    public void calculateSurface(int radius) {
        long area = pi * (radius * radius);
        System.out.println(area);

    }
}
