package org.example;

//import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class OrderService {
    PaymentService payment;
    public OrderService (@Lazy  PaymentService payment) // proxy return of payment
    {
        this.payment = payment;

        System.out.println("order service created  ");
    }
    public void order()
    {
        payment.pay();
    }
    public void getOrder()
    {
        System.out.println("get order");
    }
}
