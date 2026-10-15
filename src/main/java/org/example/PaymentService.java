package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentService {
OrderService order;
    public PaymentService (OrderService order
){
        System.out.println("payment created");
        this.order = order;
    }



    public void pay()
    {
        System.out.println("payy");
        order.getOrder() ;
    }
}
