public class Triangle extends Shapes {
    private long base;
    private long height;
    private long verticalHeight1;
    private long verticalHeight2;
    private long verticalHeight3;
    private long area;
    private long perimeter;

//    public Triangle(long base, long height) {
//        this.base = base;
//        this.height = height;
//    }

//    public Triangle(long base, long verticalHeight1, long verticalHeight2, long verticalHeight3) {
//        this.base = base;
//        this.verticalHeight1 = verticalHeight1;
//        this.verticalHeight2 = verticalHeight2;
//        this.verticalHeight3 = verticalHeight3;
//    }

    public void calculatePrimeter(long verticalHeight1, long verticalHeight2, long verticalHeight3) {
        long perimeter = verticalHeight1 + verticalHeight2+ verticalHeight3;
        System.out.println(perimeter);

        //P=a+b+c
    }

    public void calculateSurface(long base, long height) {
        long area = 1/2 * base * height;

        //Area = ½ × b × h
        System.out.println(area);


    }
}
