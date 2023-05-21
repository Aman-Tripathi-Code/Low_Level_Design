package Single_Responsibility;

public class SaveToDao {
    InvoiceCalculator invoice;
    public SaveToDao(InvoiceCalculator invoice){
        this.invoice = invoice;
    }

    public void save(){
        //save the invoice
    }
}
