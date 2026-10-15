package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class) ;


OrderService o = context.getBean(OrderService.class) ;  // object call - lazy initialization

// prototype scope  ---->  in lazy initialization object is not created  whenever we are not call to its. - @Lazy
        //singletone  scope(bydefault) --->  eager initialization is bydefault and object is always created , not need to call object - @Eager  (not compalsary to write annotation )
o.order();
    }
}