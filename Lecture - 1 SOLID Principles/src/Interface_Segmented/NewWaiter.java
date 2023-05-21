package Interface_Segmented;

public class NewWaiter implements WaiterInterface{
    @Override
    public void serveCustomer() {
        System.out.println("Serving the customers");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking orders");
    }
}
