package br.lpm.EXERCICIOS.A;

import java.util.ArrayList;
import java.util.List;

public class OrderCenter {
    private final Subject subject;
    private static OrderCenter instance;
    private List<Order> orders;

    private OrderCenter(Subject subject) {
        this.subject = subject;
        orders = new ArrayList<>();
    }

    public static OrderCenter getInstance(Subject subject) {
        if (instance == null) {
            instance = new OrderCenter(subject);
        }
        return instance;
    }

    public void addOrder(Order order) {
        orders.add(order);
        subject.notifyObservers(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public List<Order> listOrders (){
        return orders;
    }
}
