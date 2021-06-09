package week3.template;

public class OrderTemplate1 extends TicketProcessTemplate{

    @Override
    public void makeSelection() {
        System.out.println("Selection process 1 working . . .");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment process 1 executed.");
    }

    @Override
    public void makeDelivery() {
        System.out.println("Packet shipped for delivery.");
    }
}
