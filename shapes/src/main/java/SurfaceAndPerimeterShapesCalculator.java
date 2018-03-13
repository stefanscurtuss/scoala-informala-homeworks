public class SurfaceAndPerimeterShapesCalculator {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.calculatePrimeter();

        Square square1 = new Square();
        square1.calculatePrimeter(3);

        Triangle triangle1 = new Triangle();
        triangle1.calculatePrimeter(4,8,4);
    }
}
