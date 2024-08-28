package org.example.app;

import java.util.PriorityQueue;
import java.util.Queue;

public class Order {
    Queue<Order> orders = new PriorityQueue<>();

    public Queue<Order> getOrders() {
        return orders;
    }
}
