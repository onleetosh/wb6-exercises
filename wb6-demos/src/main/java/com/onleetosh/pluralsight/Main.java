package com.onleetosh.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create line items
        LineItem item1 = new LineItem(101, "Laptop", 899.99, 2);
        LineItem item2 = new LineItem(102, "Smartphone", 499.99, 1);
        LineItem item3 = new LineItem(103, "Keyboard", 29.99, 3);
        LineItem item4 = new LineItem(104, "Mouse", 19.99, 2);

        // Create an order for a customer
        Order order = new Order(1001, "John Doe");

        // Add line items to the order
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);
        order.addItem(item4);

        // Display total
        System.out.println("Total: $" + order.getTotal());

        //Get all orders under $25.
        List<Order> allOrders = new ArrayList<>();
        // populate all ordrders
        List<Order> impulseOrders = new ArrayList<>();
        // loop through all orders
        // and add them to the list of impulse buys
        for(Order o: allOrders){
            if(order.getTotal() < 25){
                impulseOrders.add(o);
            }
        }
    }
}