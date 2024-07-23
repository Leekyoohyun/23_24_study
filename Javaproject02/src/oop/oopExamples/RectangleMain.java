package oop.oopExamples;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int area =rectangle.calculateArea(5,8);
        int perimeter = rectangle.calculatePerimeter(5,8);
        boolean square = rectangle.isSquare(5,8);
        System.out.println("넓이: "+area);
        System.out.println("둘레: "+perimeter);
        System.out.println("정사각형 여부: "+square);
    }
}
