package week3.iterator;

public class OrderIterator implements Iterator {

    Order[] OrderList;

    int position = 0;

    public OrderIterator(Order[] orders) {
        this.OrderList = orders;
    }

    @Override
    public boolean hasNext() {
        if (position >= OrderList.length || OrderList[position] == null)
            return false;
        else {
            return true;
        }
    }

    @Override
    public Object next() {
        Order order = OrderList[position];
        position++;
        return order;
    }

}
