package week3.iterator;

public class OrderLister {

    OrderCollection orderCollection;

    Iterator iterator;

    public OrderLister(OrderCollection orderCollection) {
        this.orderCollection = orderCollection;
        iterator = this.orderCollection.createIterator();
    }

    public void printMyOrders() {

        System.out.println("- - - - - - - MY ORDERS - - - - - - -");

        while (iterator.hasNext()) {
            Order n = (Order)iterator.next();
            System.out.println(n.getName());

        }
    }

}
