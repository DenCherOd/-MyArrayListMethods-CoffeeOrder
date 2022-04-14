package coffee.order;

import java.util.LinkedList;
import java.util.List;

public class CoffeeOrderBoard {
    private final List<Order> orderList = new LinkedList<>();
    private int currentOrderNumber = 0;

    public void add(String name) {
        Order order = new Order();
        order.setName(name);
        order.setOrderNumber(++currentOrderNumber);
        orderList.add(order);
        draw();
    }

    public void deliver() {
        if (orderList.size() != 0) {
            orderList.remove(0);
            draw();
        } else {
            System.out.println("There is no orders yet");
        }
    }

    public void deliver(int orderNumber) {
        if (orderList.size() != 0) {
            for (int i = 0; i <= orderList.size() - 1; i++) {
                if (orderList.get(i).getOrderNumber() == orderNumber) {
                    orderList.remove(i);
                    draw();
                    return;
                }
            }
            System.out.println("Order with " + orderNumber + " number does not exist");
        } else {
            System.out.println("There is no orders yet");
        }
    }

    private void draw() {
        if (orderList.size() != 0) {
            System.out.println("=============");
            System.out.println("Num  | Name");
            for (Order order : orderList) {
                System.out.println(order.getOrderNumber() + "  |  " + order.getName());
            }
        }
    }
}
