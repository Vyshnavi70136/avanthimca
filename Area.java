public class Area {

    // Method overloading for calculating area of a square
    public double area(double side) {
        return side * side;
    }

    // Method overloading for calculating area of a rectangle
    public double area(double length, double width) {
        return length * width;
    }

    // Method overloading for calculating area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculating area of a square
        double squareArea = calculator.area(5.0);
        System.out.println("Area of square: " + squareArea);

        // Calculating area of a rectangle
        double rectangleArea = calculator.area(4.0, 6.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        // Calculating area of a circle
        double circleArea = calculator.area(3.0);
        System.out.println("Area of circle: " + circleArea);
    }
}

