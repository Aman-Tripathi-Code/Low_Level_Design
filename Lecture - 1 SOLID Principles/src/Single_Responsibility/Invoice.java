package Single_Responsibility;

public class Invoice {
    Marker marker;
    private  int quantity;

    public Invoice(Marker marker , int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    // 3 functions --> 3 reasons to change

    public int calculateTotal(){
        int price = ((marker.price) * this.quantity);
        return price;
    }

    public void printInvoice(){
        //print the invoice
    }

    public void saveToDB(){
        //Save the data into DB
    }
}
