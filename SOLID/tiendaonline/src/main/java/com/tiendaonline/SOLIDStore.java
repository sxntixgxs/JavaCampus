package com.tiendaonline;

import java.util.ArrayList;
import java.util.List;

// Single Responsibility Principle
// Cada clase debe tener una sola responsabilidad
//Separemos responsabilidades de cálculo del total y de pago

//Clase pedido
class Order{
    private List<Product> products;
    public Order(){
        products = new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public List<Product> geProducts(){
        return products;
    }
}

//Clase calculadora de total
class OrderCalculator{
    public double calculateTotal(Order order){
        double total = 0;
        for (Product product : order.geProducts()) {
            total += product.getPrice();
        }
        return total;
    }
}

// Open Close Principle
// Vamos a permitir la extensión de lmétodo de pago sin modificar la clase Payment

//Interfaz PaymentMethod
interface PaymentMethod{
    public void pay(double amount);
}

//Implementación tarjeta de crédito
class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paying with credit card: "+amount);
    }
}

//Implementación de Paypal
class PayPalPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Paying with PayPal: "+amount);
        
    }
}


//Liskov Substitution Principle
//Las clases de pago se deben poder intercambiar sin afectar el programa

//Interface Segregation Principle
// A client should never be forced to implement an interface that it doesn't use, or clients shouldn't be forced to depend on methods they do not use.
// Creamos interfaces pequeñas y específicas si fuese necesario, pero en este caso ya lo hemos hecho con PaymentMethod

//Dependency Inversion Principle
// High-levels modules -OrderProcessor- should not depend on low-level--CreditCardPayment- modules, but on abstractions -PaymentMethod-
// Abstractions should not depend on details. Details should depend on abstractions


//Clase procesadora de pedidos
class OrderProcessor{
    private OrderCalculator calculator;
    private PaymentMethod paymentMethod;

    public OrderProcessor(OrderCalculator calculator, PaymentMethod paymentMethod){
        this.calculator = calculator;
        this.paymentMethod = paymentMethod;
    }
    public void process(Order order){
        double amount = calculator.calculateTotal(order);
        paymentMethod.pay(amount);
    }
}

//controlador ?
public class SOLIDStore{
    public static void main(String[] args) {
        Product product1 = new Product("Product 1", 10.0);
        Product product2 = new Product("Product 2",15.0);

        Order order = new Order();
        order.addProduct(product2);
        order.addProduct(product1);

        OrderCalculator calculator = new OrderCalculator();
        PaymentMethod paymentMethod = new PayPalPayment();//o se puede usar CreditCardPayment

        OrderProcessor processor = new OrderProcessor(calculator, paymentMethod);
        processor.process(order);
    }
}