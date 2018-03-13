public class Rectangle extends Shapes {
    private int width;
    private int height;
    private int area;
    private int perimeter;

//    public Rectangle(int width, int height) {
//        this.width = width;
//        this.height = height;
//    }

    public void calculatePrimeter(int width, int height) {
        int perimeter = 2 * (height * width);
        // P=2(h+w)
        System.out.println(perimeter);
    }

    public void calculateSurface(int width, int height) {
        int area = width * height;
        //Area = w × h
        System.out.println(area);

    }
}
