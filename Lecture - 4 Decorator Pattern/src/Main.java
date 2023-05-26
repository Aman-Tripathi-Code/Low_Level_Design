public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new MargheritaPizza()));
        System.out.println(pizza.cost());
    }
}