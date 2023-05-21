package Interface_Segmented;

public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {
        //not my job
    }

    @Override
    public void serveCustomer() {
        System.out.println("Serving Customer");
    }

    @Override
    public void cookFook() {
        //not my job
    }
}
