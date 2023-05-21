package Single_Responsibility;

public class PrintInvoice {
    private InvoiceCalculator invoice;

    PrintInvoice(InvoiceCalculator invoice){
        this.invoice = invoice;
    }

    public void print(){
        //prints the invoice
    }
}
