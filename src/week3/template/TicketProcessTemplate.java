package week3.template;

public abstract class TicketProcessTemplate {


    public abstract void makeSelection();

    public abstract void makePayment();

    public abstract void makeDelivery();

    public final void processOrder() {
        makeSelection();
        makePayment();
        makeDelivery();
    }

}
