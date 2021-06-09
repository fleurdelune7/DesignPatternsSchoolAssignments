package week3.template;

public class OrderTemplate2 extends TicketProcessTemplate{

    @Override
    public void makeSelection() {
        System.out.println("Selection process 2 working . . .");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment process 2 executed.");
    }

    @Override
    public void makeDelivery() {
        System.out.println("Packet delivered to courier.");
    }
}
