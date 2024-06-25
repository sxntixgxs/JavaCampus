package com.tiendaonline;

import java.util.ArrayList;
import java.util.List;

//Clase Producto
class Product{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    
}

// Clase Pedido
class Order {
    private List<Product> products;
    public Order(){
        products = new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public double calculateTotal(){
        double total = 0;
        for (Product product : products) {
            total+=product.getPrice();
        }
        return total;

    }
}

// Clase Pago
class Payment{
    public void pay(Order order){
        System.out.println("Paying "+order.calculateTotal());
    }
}

public class OnlineStore{
    public static void main(String[] args){
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2", 15.0);

        Order order = new Order();
        order.addProduct(product1);
        order.addProduct(product2);

        Payment payment = new Payment();
        payment.pay(order);
    }
}