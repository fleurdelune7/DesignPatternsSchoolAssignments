package week3.iterator;

public class OrderCollection implements MyCollection{

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Order[] orders;

    public OrderCollection() {
        orders = new Order[MAX_ITEMS];
    }

    public void addItem(String name) {
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Collection full !");
        else {
            Order order = new Order(name);
            orders[numberOfItems] = order;
            numberOfItems++;
        }
    }


    @Override
    public Iterator createIterator() {
        return new OrderIterator(orders);
    }
}
