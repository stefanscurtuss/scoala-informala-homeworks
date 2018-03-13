public class Square extends Shapes {
    private int lengthOFSide;

//    public Square(int lengthOFSide) {
//        this.lengthOFSide = lengthOFSide;
//    }

    private int area;
    private int perimeter;

    public void calculatePrimeter(int lengthOFSide) {
        int perimeter = 4 * lengthOFSide;
        //P=4a
        System.out.println(perimeter);
    }

    public void calculateSurface(int lengthOFSide) {
        int area = 2 * lengthOFSide;

        //Area = a2
        System.out.println(area);

   }
}
