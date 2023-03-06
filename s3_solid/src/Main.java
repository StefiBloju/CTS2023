public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 20);

        double circleArea = AreaCalculator.calculateArea(circle);
        double rectangleArea = AreaCalculator.calculateArea(rectangle);

        System.out.println("Circle area: " + circleArea);
        System.out.println("Rectangle area: " + rectangleArea);
    }
}
