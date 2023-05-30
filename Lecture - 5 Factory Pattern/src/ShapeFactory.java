public class ShapeFactory {
    Shape getShape(String input){
        return switch (input) {
            case "Circle" -> new Circle();
            case "Rectangle" -> new Rectangle();
            case "Square" -> new Square();
            default -> null;
        };
    }
}
